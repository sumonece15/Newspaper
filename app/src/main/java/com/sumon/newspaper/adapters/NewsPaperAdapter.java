package com.sumon.newspaper.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sumon.newspaper.R;
import com.sumon.newspaper.WebViewActivity;
import com.sumon.newspaper.models.Newspaper;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class NewsPaperAdapter extends RecyclerView.Adapter<NewsPaperAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Newspaper> dataList;

    public NewsPaperAdapter(Context mContext, ArrayList<Newspaper> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_newspaper,parent,false);
        NewsPaperAdapter.MyViewHolder rvh = new NewsPaperAdapter.MyViewHolder(view);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Newspaper newspaper = dataList.get(position);

        Glide.with(mContext)
                .load(newspaper.getCoverImage())
                .into(holder.ivCoverImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("name",newspaper.getName());
                intent.putExtra("link",newspaper.getLink());
                intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivCoverImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivCoverImage = itemView.findViewById(R.id.ivCoverImage);


        }
    }
}
