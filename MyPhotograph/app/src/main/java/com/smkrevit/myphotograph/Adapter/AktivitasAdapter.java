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

import com.smkrevit.myphotograph.DetailAktivitas;
import com.smkrevit.myphotograph.Model.Aktivitas;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class AktivitasAdapter extends RecyclerView.Adapter<AktivitasAdapter.ViewHolder> {
    private Context context;
    private List<Aktivitas> aktivitasList;

    public AktivitasAdapter(Context context, List<Aktivitas> aktivitasList) {
        this.context = context;
        this.aktivitasList = aktivitasList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_aktivitas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AktivitasAdapter.ViewHolder holder, int position) {
        Aktivitas aktivitas = aktivitasList.get(position);

        holder.tvNamaAktiv.setText(aktivitas.getAktivitas());
        holder.tvPukulAktiv.setText(aktivitas.getPukul());
        holder.tvDescAktiv.setText(aktivitas.getDescaktiv());
        holder.tvStatus.setText(aktivitas.getStatus());
        holder.linearLayoutR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailAktivitas.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return aktivitasList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaAktiv, tvPukulAktiv, tvDescAktiv, tvStatus;
        LinearLayout linearLayoutR;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaAktiv = itemView.findViewById(R.id.tvAktivitas);
            tvPukulAktiv = itemView.findViewById(R.id.tvPukulAktivitas);
            tvDescAktiv = itemView.findViewById(R.id.tvDescAktivitas);
            tvStatus = itemView.findViewById(R.id.tvStatus);
            linearLayoutR = itemView.findViewById(R.id.layoutAktivitas);
        }
    }
}
