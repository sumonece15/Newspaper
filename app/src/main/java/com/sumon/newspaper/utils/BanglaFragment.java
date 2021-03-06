package com.sumon.newspaper.utils;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sumon.newspaper.R;
import com.sumon.newspaper.adapters.NewsPaperAdapter;
import com.sumon.newspaper.data.DataSource;

public class BanglaFragment extends Fragment {

    private RecyclerView rvNewspaper;
    private NewsPaperAdapter mAdapter;

    public BanglaFragment() {
        // Required empty public constructor
    }

    public static BanglaFragment newInstance(String param1, String param2) {
        BanglaFragment fragment = new BanglaFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bangla, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initVariable();
        initView(view);
        initFunctionality();
        initListener();
    }

    private void initVariable() {

    }

    private void initView(View view) {

        rvNewspaper = view.findViewById(R.id.rvNewsPaper);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        rvNewspaper.addItemDecoration(new ItemDecoration(2,10,false));
        rvNewspaper.setLayoutManager(layoutManager);
    }

    private void initFunctionality() {
        mAdapter = new NewsPaperAdapter(getActivity(), DataSource.getBanglaNewsPaper());
        rvNewspaper.setAdapter(mAdapter);
    }

    private void initListener() {




    }
}