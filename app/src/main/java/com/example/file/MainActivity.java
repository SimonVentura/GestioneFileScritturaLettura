package com.example.file;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btnLeggi;
     Button btnScrivi;
     EditText txtNome;
     Gestore gestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestore = new Gestore("fileDaLeggere");

        btnLeggi = findViewById(R.id.btnLeggi);
        btnScrivi = findViewById(R.id.btnScrivi);
        txtNome = findViewById(R.id.txtNome);

        btnLeggi.setOnClickListener(new View.OnClickListener() {
            //assegnare il comportamento
            @Override
            public void onClick(View v) {
                String risultaro = gestore.leggiFile("fileDaLeggere.txt",getApplicationContext());

            }
        });
        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String esito = gestore.scriviFile("prova.txt",getApplicationContext());
                Toast.makeText(getApplicationContext(),esito,)
            }
        });

            }
        }
