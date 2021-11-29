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

import com.smkrevit.myphotograph.DetailHistory;
import com.smkrevit.myphotograph.Model.History;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {
    private Context ctx;
    private List<History> historyList;

    public HistoryAdapter(Context ctx, List<History> historyList) {
        this.ctx = ctx;
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        History history = historyList.get(position);

        holder.tvHistory.setText(history.getHistory());
        holder.tvPukul.setText(history.getPukul());
        holder.tvDescHisto.setText(history.getDeschistory());
        holder.tvStatusHisto.setText(history.getStatus());
        holder.linearLayoutG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx, DetailHistory.class);
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvHistory, tvPukul, tvDescHisto, tvStatusHisto;
        LinearLayout linearLayoutG;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvHistory = itemView.findViewById(R.id.tvHistory);
            tvPukul = itemView.findViewById(R.id.tvPukulHistory);
            tvDescHisto = itemView.findViewById(R.id.tvDescHistory);
            tvStatusHisto = itemView.findViewById(R.id.tvStatusHIstory);
            linearLayoutG = itemView.findViewById(R.id.layoutHistory);
        }
    }
}
