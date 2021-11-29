package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smkrevit.myphotograph.Adapter.KeranjangAdapter;

import java.util.ArrayList;
import java.util.List;

public class Keranjang extends AppCompatActivity {
    RecyclerView recyclerView;
    KeranjangAdapter adapter;
    List<com.smkrevit.myphotograph.Model.Keranjang> keranjangList;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);

        load();
        isiData();
        btnPesan();
    }

    private void load() {
        recyclerView = findViewById(R.id.rcvKeranjang);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void isiData() {
        keranjangList = new ArrayList<>();

        keranjangList.add(new com.smkrevit.myphotograph.Model.Keranjang("Paket Premium","Paket ini meliputi foto dan video, dan membawa crew sebanyak 1 fotografer dan 1 videografer", "Rp. 2.500.000"));

        adapter = new KeranjangAdapter(this, keranjangList);
        recyclerView.setAdapter(adapter);
    }

    private void btnPesan() {
        btn = findViewById(R.id.btnPesan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Keranjang.this, DetailAktivitas.class);
                startActivity(intent);
            }
        });
    }
}