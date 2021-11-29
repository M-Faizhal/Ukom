package com.smkrevit.myphotograph.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smkrevit.myphotograph.DetailHome;
import com.smkrevit.myphotograph.Model.Item;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.tvNama.setText(item.getNama());
        holder.tvAlamat.setText(item.getAlamat());
        holder.tvPukul.setText(item.getPukul());
        holder.tvRating.setText(item.getRating());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailHome.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvAlamat, tvPukul, tvRating;
        ImageView ivItem;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivItem = itemView.findViewById(R.id.imgItem);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvAlamat = itemView.findViewById(R.id.tvAlamatItem);
            tvPukul = itemView.findViewById(R.id.tvPukul);
            tvRating = itemView.findViewById(R.id.tvRating);
            linearLayout = itemView.findViewById(R.id.layoutItem);
        }
    }
}
