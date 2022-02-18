package com.example.file;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btnLeggi;
     Button btnScrivi;
     EditText txtNome;
     Gestore gestore;
     TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestore = new Gestore();

        btnLeggi = findViewById(R.id.btnLeggi);
        btnScrivi = findViewById(R.id.btnScrivi);
        txtNome = findViewById(R.id.txtNome);
        txtView = (TextView) findViewById(R.id.textView);

        btnLeggi.setOnClickListener(new View.OnClickListener() {
            //assegnare il comportamento
            @Override
            public void onClick(View v) {
               // String risultato = gestore.leggiFile("prova.txt",getApplicationContext());
                //txtView.setText(risultato);
               // Toast.makeText(getApplicationContext(),risultato,Toast.LENGTH_LONG).show();

                //fatto con il raw
                String righelette= gestore.leggiFileRaw(
                getApplicationContext());
                Toast.makeText(getApplicationContext(),righelette,Toast.LENGTH_LONG).show();
            }
        });
        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ritorno = gestore.scriviFile("prova.txt",getApplicationContext());
                Toast.makeText(getApplicationContext(),ritorno,Toast.LENGTH_LONG).show();
            }
        });

            }
        }
