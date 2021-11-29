package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.smkrevit.myphotograph.Adapter.DetailAdapter;
import com.smkrevit.myphotograph.Adapter.HistoryAdapter;
import com.smkrevit.myphotograph.Model.DetailItem;
import com.smkrevit.myphotograph.Model.History;

import java.util.ArrayList;
import java.util.List;

public class DetailHome extends AppCompatActivity {
    RecyclerView recyclerView;
    DetailAdapter adapter;
    List<DetailItem> detailItemList;
    TextView tvNamaToko, tvPukulToko, tvAlamatToko, tvRatingToko;
    ImageView ivToko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_home);

        load();
        String toko = getIntent().getStringExtra("toko");
        String pukul = getIntent().getStringExtra("pukul");
        String alamattoko = getIntent().getStringExtra("alamattoko");
        String rating = getIntent().getStringExtra("rating");

        tvNamaToko = findViewById(R.id.tvNamaToko);
        tvPukulToko = findViewById(R.id.tvPukulDetail);
        tvAlamatToko = findViewById(R.id.tvAlamatToko);
        tvRatingToko = findViewById(R.id.tvRatingToko);
        ivToko = findViewById(R.id.ivDetailHome);

        tvNamaToko.setText(getIntent().getStringExtra(toko));
        tvPukulToko.setText(getIntent().getStringExtra(pukul));
        tvAlamatToko.setText(getIntent().getStringExtra(alamattoko));
        tvRatingToko.setText(getIntent().getStringExtra(rating));
        Glide.with(DetailHome.this)
                .load(getIntent().getStringExtra("imgtoko"))
                .into(ivToko);

        isiData();
    }

    private void load() {

        recyclerView = findViewById(R.id.rcvDetailItem);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void isiData() {
        detailItemList = new ArrayList<>();

        detailItemList.add(new DetailItem("Paket Premium","Paket ini meliputi foto dan video, dan membawa crew sebanyak 1 fotografer dan 1 videografer", "Rp. 2.500.000"));
        detailItemList.add(new DetailItem("Paket Cinematic","Paket ini meliputi foto dan video, dan membawa crew sebanyak 1 fotografer dan 1 videografer", "Rp. 2.750.000"));
        detailItemList.add(new DetailItem("Paket Cinematic+","Paket ini meliputi foto dan video, dan membawa crew sebanyak 1 fotografer, 1 videografer shooting, dan 1 videografer cinematic", "Rp. 3.850.000"));

        adapter = new DetailAdapter(this, detailItemList);
        recyclerView.setAdapter(adapter);
    }
}