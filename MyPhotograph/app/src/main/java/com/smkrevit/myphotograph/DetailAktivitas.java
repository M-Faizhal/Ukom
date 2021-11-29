package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailAktivitas extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_aktivitas);

        batal();
    }

    public void batal() {
        btn = findViewById(R.id.btnBatal);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailAktivitas.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}