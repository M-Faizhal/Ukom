package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView tvDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setLength();

        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = v.getId();
                if (i == R.id.btnLogin) {
                    if (editText.getText().toString().length() < 6) {
                        editText.setError("Minimum Password 6");
                    } else {
                        openActivity();
                    }
                }
            }
        });

        regis();
    }

    public void setLength() {
        editText = findViewById(R.id.editTextTextPersonName7);
        int length = 25;
        editText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(length)});
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void regis() {
        tvDaftar = findViewById(R.id.tvDaftar);
        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inet = new Intent(Login.this, Registration.class);
                startActivity(inet);
            }
        });
    }


}