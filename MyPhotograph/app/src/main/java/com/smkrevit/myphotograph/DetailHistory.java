package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailHistory extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_history);

        pesanLagi();
    }

    public void pesanLagi() {
        btn = findViewById(R.id.btnUlang);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailHistory.this, Keranjang.class);
                startActivity(intent);
            }
        });
    }
}