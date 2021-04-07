package com.sumon.newspaper;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DivisionFragment extends Fragment {

    private CardView cvDhaka, cvChittagong, cvBarishal, cvSylhet, cvRangpur, cvRajshahi, cvMymensing, cvKhulna;

    public DivisionFragment() {
        // Required empty public constructor
    }

    public static DivisionFragment newInstance(String param1, String param2) {
        DivisionFragment fragment = new DivisionFragment();
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
        return inflater.inflate(R.layout.fragment_division, container, false);
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
        cvDhaka = view.findViewById(R.id.cvDhaka);
        cvBarishal = view.findViewById(R.id.cvBarishal);
        cvChittagong = view.findViewById(R.id.cvChittagong);
        cvKhulna = view.findViewById(R.id.cvKhulna);
        cvMymensing = view.findViewById(R.id.cvMymensinh);
        cvRajshahi = view.findViewById(R.id.cvRajshahi);
        cvRangpur = view.findViewById(R.id.cvRangpur);
        cvSylhet = view.findViewById(R.id.cvSylhet);
    }

    private void initFunctionality() {

    }

    private void initListener() {

        cvDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(1);
            }
        });
        cvChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(2);
            }
        });
        cvBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(3);
            }
        });
        cvSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(4);
            }
        });
        cvRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(5);
            }
        });
        cvMymensing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(6);
            }
        });
        cvKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(7);
            }
        });

        cvRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDivisionalNewspaper(8);
            }
        });
    }

    private void gotoDivisionalNewspaper(int division){
        Intent intent = new Intent(getActivity(),DivisionalNewspaperActivity.class);
        intent.putExtra("division",division);
        startActivity(intent);
    }
}