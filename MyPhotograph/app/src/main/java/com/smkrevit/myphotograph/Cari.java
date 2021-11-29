package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Cari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        
        setContentView(R.layout.activity_search);
    }
}