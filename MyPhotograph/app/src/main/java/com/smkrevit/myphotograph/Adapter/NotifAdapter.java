package com.smkrevit.myphotograph.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smkrevit.myphotograph.Model.Notif;
import com.smkrevit.myphotograph.R;

import java.util.List;

public class NotifAdapter extends RecyclerView.Adapter<NotifAdapter.ViewHolder> {
    private Context context;
    private List<Notif> notifList;

    public NotifAdapter(Context context, List<Notif> notifList) {
        this.context = context;
        this.notifList = notifList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notif, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotifAdapter.ViewHolder holder, int position) {
        Notif notif = notifList.get(position);

        holder.tvNotif.setText(notif.getNotif());
        holder.tvDescNotif.setText(notif.getDesc());
    }

    @Override
    public int getItemCount() {
        return notifList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNotif, tvDescNotif;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNotif = itemView.findViewById(R.id.tvNotif);
            tvDescNotif = itemView.findViewById(R.id.tvIsiNotif);
        }
    }
}
