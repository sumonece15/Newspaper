package com.sumon.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.sumon.newspaper.adapters.ViewPagerAdapter;
import com.sumon.newspaper.utils.BanglaFragment;
import com.sumon.newspaper.utils.DivisionFragment;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        initVariable();
        initView();
        initFunctionality();
        initListener();
    }

    private void initVariable() {

    }

    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BanglaFragment(), "Bangla");
        adapter.addFragment(new EnglishFragment(), "English");
        adapter.addFragment(new TvNewsFragment(), "TV News");
        adapter.addFragment(new JobNewsFragment(), "Job News");
        adapter.addFragment(new DivisionFragment(), "Divisional");
        viewPager.setAdapter(adapter);
    }

    private void initFunctionality() {

    }

    private void initListener() {

    }
}