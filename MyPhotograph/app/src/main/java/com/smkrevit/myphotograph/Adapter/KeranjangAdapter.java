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

import com.smkrevit.myphotograph.ActivityFragment;
import com.smkrevit.myphotograph.Model.Keranjang;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class KeranjangAdapter extends RecyclerView.Adapter<KeranjangAdapter.ViewHolder> {
    private Context context;
    private List<Keranjang> keranjangList;

    public KeranjangAdapter(Context context, List<Keranjang> keranjangList) {
        this.context = context;
        this.keranjangList = keranjangList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_keranjang, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Keranjang keranjang = keranjangList.get(position);

        holder.tvNama.setText(keranjang.getNama());
        holder.tvDescPesanan.setText(keranjang.getDescPesanan());
        holder.tvHargaPesanan.setText(keranjang.getHargaPesanan());
    }

    @Override
    public int getItemCount() {
        return keranjangList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvDescPesanan, tvHargaPesanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvPesanan);
            tvDescPesanan = itemView.findViewById(R.id.tvDescPesanan);
            tvHargaPesanan = itemView.findViewById(R.id.tvHargaPesanan);
        }
    }
}
