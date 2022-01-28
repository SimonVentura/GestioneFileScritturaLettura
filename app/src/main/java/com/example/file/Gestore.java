package com.example.file;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Gestore {
    String nomeFile;
    Context c;

    public Gestore(String nomeFile)
    {
        this.nomeFile = nomeFile;
    }


    public String leggiFile(String nomeFile, Context c)
    {
        String str = "";
        //aperto il file
        try {
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(c.openFileInput(nomeFile)));//eccezione prima del trycatch
            //leggere la riga
            str = br.readLine();

        } catch (FileNotFoundException e) {
            Log.e("errore", "errore nell'apertura del file");

            //errore leggere riga
        } catch (IOException e) {
            Log.e("errore",e.toString());
        }


        return str;
    }



    public void scriviFile(String nomeFile,String testo)
    {

    }

}
