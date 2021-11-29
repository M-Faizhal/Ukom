package com.smkrevit.myphotograph.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.smkrevit.myphotograph.DetailHome;
import com.smkrevit.myphotograph.Model.ModelPhotograph;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class AdapterPhotograph extends RecyclerView.Adapter<AdapterPhotograph.ViewHolder> {
    Context context;
    List<ModelPhotograph> data;

    public AdapterPhotograph(Context context, List<ModelPhotograph> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelPhotograph photograph = data.get(position);
        holder.tvNamaToko.setText(photograph.getToko());
        holder.tvPukulToko.setText(photograph.getPukul());
        holder.tvAlamatToko.setText(photograph.getAlamattoko());
        holder.tvRatingToko.setText(photograph.getRating());
        Glide.with(holder.itemView.getContext())
                .load(""+photograph.getImgtoko())
                .into(holder.ivToko);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailHome.class);
                intent.putExtra("toko", photograph.getToko());
                intent.putExtra("pukul", photograph.getPukul());
                intent.putExtra("alamattoko", photograph.getAlamattoko());
                intent.putExtra("rating", photograph.getRating());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaToko, tvPukulToko, tvAlamatToko, tvRatingToko;
        ImageView ivToko;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaToko = itemView.findViewById(R.id.tvNama);
            tvPukulToko = itemView.findViewById(R.id.tvPukul);
            tvAlamatToko = itemView.findViewById(R.id.tvAlamatItem);
            tvRatingToko = itemView.findViewById(R.id.tvRating);
            ivToko = itemView.findViewById(R.id.imgItem);
        }
    }
}