package com.sumon.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WebViewActivity extends AppCompatActivity {

    WebView wvBrowser;
    TextView tvEmpty;
    ProgressBar pbLoader;
    SwipeRefreshLayout mySwipeRefreshLayout;
    private String name,websiteUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        wvBrowser = findViewById(R.id.wv_browser);
        tvEmpty = findViewById(R.id.tv_empty);
        pbLoader = findViewById(R.id.pb_loader);
        mySwipeRefreshLayout = findViewById(R.id.swipeContainer);

        Bundle extras = getIntent().getExtras();
        name = extras.getString("name");
        websiteUrl = extras.getString("link");

        loadWebsite();
    }




    private void loadWebsite() {

        if (!InternetConnectionCheck.checkInternetConnection(this)){
            tvEmpty.setVisibility(View.VISIBLE);
            wvBrowser.setVisibility(View.GONE);
        }else{

           // getSupportActionBar().setTitle(name);

            wvBrowser.getSettings().setJavaScriptEnabled(true);
            wvBrowser.getSettings().setBuiltInZoomControls(true);
            wvBrowser.getSettings().setDisplayZoomControls(false);
            wvBrowser.setWebViewClient(new CustomWebClient());
            wvBrowser.loadUrl(websiteUrl);

            mySwipeRefreshLayout.setOnRefreshListener(
                    new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            wvBrowser.reload();
                            mySwipeRefreshLayout.setRefreshing(false);
                        }
                    }
            );
        }

    }


    public class CustomWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
            pbLoader.setVisibility(View.VISIBLE);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            pbLoader.setVisibility(View.VISIBLE);
            mySwipeRefreshLayout.setVisibility(View.GONE);
            tvEmpty.setVisibility(View.GONE);
            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            pbLoader.setVisibility(View.GONE);
            mySwipeRefreshLayout.setVisibility(View.VISIBLE);
        }
    }

    /* @Override
     public void onBackPressed() {
         wvBrowser.goBack();
     }*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}