package com.example.file;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.contentcapture.ContentCaptureCondition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Gestore {                  //1)stream di byte
                                        //2)stream di caratteri
                                        //3)lo bufferizzo
    String nomeFile;
    Context c;
    StringBuilder sB;

    public Gestore(String nomeFile)
    {
        this.nomeFile = nomeFile;
    }
    public Gestore(){

    };


    public String leggiFile(String nomeFile, Context c)
    {
        String str = "";
        sB= new StringBuilder();
        //apertura del file
        try {
            BufferedReader br = new BufferedReader(new  //per concatenare
                    InputStreamReader(c.openFileInput(nomeFile)));//eccezione prima del trycatch
            //leggere la riga
            //str = br.readLine();         //input restituisce un oggetto di tipo bufferedreader perchè è una classe astratta.

            //ciclo sulle righe perleggere riga per riga
            //accodo ogni riga alla stringa
            String inputString;
            while((inputString = br.readLine())  != null)
            {
                sB.append(inputString + "\n");
            }
            //stringa concatenata che contiene gutto il file.
            return sB.toString();

        } catch (FileNotFoundException e) {
            Log.e("errore", "errore nell'apertura del file");
            return "FNF";
            //errore leggere riga
        } catch (IOException e) {
            Log.e("errore","errore in lettura");  //metodo che invochiamo LOG è statico
            return "IO error";
        }
    }



    public String scriviFile(String nomeFile, Context c){
        FileOutputStream fileO;
        String testodascrivere="son il testo scritto nel file";
        String esito="";

        try {
            fileO = c.openFileOutput(nomeFile,Context.MODE_PRIVATE);
            fileO.write(testodascrivere.getBytes());
            fileO.close();
            esito="scrittura corretta";
        } catch (FileNotFoundException e) { //FNF
            e.printStackTrace();
            esito="attenzione errore in apertura";
        } catch (IOException e) {          //I/O
            esito="errore in scrittura";
        }

        return esito;
    }

    //raw
    public String leggiFileRaw(Context c)
    {
        String testo="";
        StringBuilder sb = new StringBuilder();
        Resources res = c.getResources();
        InputStream is = res.openRawResource(R.raw.brani);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            while ((testo = br.readLine()) != null) {
                sb.append(testo + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

}
