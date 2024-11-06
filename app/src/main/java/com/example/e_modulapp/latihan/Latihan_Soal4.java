package com.example.e_modulapp.latihan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.e_modulapp.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

public class Latihan_Soal4 extends AppCompatActivity {
    TextView Lat_soal4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal4);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Kembali");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Lat_soal4 = (TextView) findViewById(R.id.lat_soal4);
        String text ="";
        try {
            InputStream is = getAssets().open("lat_soal4.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Lat_soal4.setText(text);
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        super.onBackPressed();
        return true;
    }
}