package com.smkrevit.myphotograph.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smkrevit.myphotograph.DetailHome;
import com.smkrevit.myphotograph.ItemActivity;
import com.smkrevit.myphotograph.Model.DetailItem;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {
    private Context context;
    private List<DetailItem> detailItemList;

    public DetailAdapter(Context context, List<DetailItem> detailItemList) {
        this.context = context;
        this.detailItemList = detailItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false);
        return new DetailAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DetailItem detailItem = detailItemList.get(position);

        holder.tvNama.setText(detailItem.getNamaPaket());
        holder.tvDescItem.setText(detailItem.getDescPaket());
        holder.tvHarga.setText(detailItem.getHargaPaket());
        holder.linearLayoutD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ItemActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return detailItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvDescItem, tvHarga;
        LinearLayout linearLayoutD;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvDetailItem);
            tvDescItem = itemView.findViewById(R.id.tvDeskripsiItem);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            linearLayoutD = itemView.findViewById(R.id.layoutDetail);
        }
    }
}
