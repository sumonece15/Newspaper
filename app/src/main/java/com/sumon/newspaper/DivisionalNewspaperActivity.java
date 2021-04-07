package com.sumon.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sumon.newspaper.adapters.NewsPaperAdapter;
import com.sumon.newspaper.data.DataSource;
import com.sumon.newspaper.models.Newspaper;
import com.sumon.newspaper.utils.ItemDecoration;

import java.util.ArrayList;

public class DivisionalNewspaperActivity extends AppCompatActivity {

    private static final String PARAM_DIVISION = "division";
    private RecyclerView rvNewspaper;
    private NewsPaperAdapter mAdapter;
    private int division;
    private ArrayList<Newspaper> dataList;
    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisional_newspaper);

        initVariable();
        initView();
        initFunctionality();
        initListener();
    }

    private void initVariable() {

        dataList = new ArrayList<>();
        division = getIntent().getIntExtra("division",0);
    }

    private void initView() {

        tvTitle = findViewById(R.id.tvTitle);

        rvNewspaper = findViewById(R.id.rvNewsPaper);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        rvNewspaper.addItemDecoration(new ItemDecoration(2,10,false));
        rvNewspaper.setLayoutManager(layoutManager);
        mAdapter = new NewsPaperAdapter(getApplicationContext(), dataList);
        rvNewspaper.setAdapter(mAdapter);
    }

    private void initFunctionality() {
        if(division == 1){
            tvTitle.setText(getResources().getString(R.string.dhaka));
            //dataList.addAll();
        }
        else if(division == 2){
            tvTitle.setText(getResources().getString(R.string.chittagong));
            //dataList.addAll();
        }
        else if(division == 3){
            tvTitle.setText(getResources().getString(R.string.barishal));
            //dataList.addAll();
        }
        else if(division == 4){
            tvTitle.setText(getResources().getString(R.string.sylhet));
            //dataList.addAll();
        }
        else if(division == 5){
            tvTitle.setText(getResources().getString(R.string.rangpur));
            //dataList.addAll();
        }
        else if(division == 6){
            tvTitle.setText(getResources().getString(R.string.mymensing));
            //dataList.addAll();
        }
        else if(division == 7){
            tvTitle.setText(getResources().getString(R.string.khulna));
            //dataList.addAll();
        }
        else if(division == 8){
            tvTitle.setText(getResources().getString(R.string.rajshahi));
            //dataList.addAll();
        }


    }

    private void initListener() {

    }
}