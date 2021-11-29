package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smkrevit.myphotograph.Adapter.HistoryAdapter;
import com.smkrevit.myphotograph.Model.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HistoryAdapter adapter;
    List<History> historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        load();
        isiData();
    }

    private void load() {
        recyclerView = findViewById(R.id.rcvHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void isiData() {
        historyList = new ArrayList<>();

        historyList.add(new History("Pitu PhotoShoot", "14.00 - 15.00", "Paket Foto Wedding", "Sudah Selesai"));
        historyList.add(new History("Seven PhotoShoot", "14.00 - 15.00", "Paket Foto Wedding", "Sudah Selesai"));

        adapter = new HistoryAdapter(this, historyList);
        recyclerView.setAdapter(adapter);
    }
}