package com.example.file;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button btnLeggi;
     Button btnScrivi;
     EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeggi = findViewById(R.id.btnLeggi);
        btnScrivi = findViewById(R.id.btnScrivi);
        txtNome = findViewById(R.id.txtNome);

        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

            }
        }
