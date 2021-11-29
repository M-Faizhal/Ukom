package com.smkrevit.myphotograph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        setLength();

        openLogin();
    }

    public void setLength() {
        editText = findViewById(R.id.etPassword);
        int length = 25;
        editText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(length)});
    }

    public void openLogin() {
        btn = findViewById(R.id.btnSave);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = v.getId();
                if (i == R.id.btnSave) {
                    if (editText.getText().toString().length() < 6) {
                        editText.setError("Minimum Password 6");
                    } else {
                        Intent intent = new Intent(Registration.this, Login.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}