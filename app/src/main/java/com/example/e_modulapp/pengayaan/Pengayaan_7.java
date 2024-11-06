package com.example.e_modulapp.pengayaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_modulapp.R;
import com.example.e_modulapp.video.Video_Pengayaan;

import java.io.IOException;
import java.io.InputStream;

public class Pengayaan_7 extends AppCompatActivity {
    TextView Pengayaan7;
    CardView VideoPengayaan;
    Button Pengayaanpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengayaan7);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Kembali");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Pengayaan7 = (TextView)findViewById(R.id.textpengayaan);

        VideoPengayaan = (CardView)findViewById(R.id.cardpengayaan2);
        VideoPengayaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Video_Pengayaan.class);
                startActivity(intent);
            }
        });

        Pengayaanpdf = (Button)findViewById(R.id.pengayaanpdf);
        Pengayaanpdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PDF_pengayaan.class);
                startActivity(intent);
            }
        });


        String text ="";
        try {
            InputStream is = getAssets().open("pengayaan.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Pengayaan7.setText(text);

    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        super.onBackPressed();
        return true;
    }

}