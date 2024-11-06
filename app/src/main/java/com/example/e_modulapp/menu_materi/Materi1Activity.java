package com.example.e_modulapp.menu_materi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.e_modulapp.R;
import com.example.e_modulapp.eval_web.Eval_1;
import com.example.e_modulapp.latihan.Latihan_Soal1;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;


public class Materi1Activity extends AppCompatActivity {
TextView Tujuan1;
Button modulshow;
Button lat_soal1;
Button Tes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 1: SISTEM KENDALI PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);
    Tujuan1 = (TextView) findViewById(R.id.tujuan1);
    Button modulshow = (Button)findViewById(R.id.materi1go);
    modulshow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Modul_1.class);
            startActivity(intent);
        }
    });

    Button lat_soal1 = (Button)findViewById(R.id.lat1go);
    lat_soal1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Latihan_Soal1.class);
            startActivity(intent);
        }
    });


    Button Tes1 = (Button)findViewById(R.id.tes1go);
    Tes1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Eval_1.class);
            startActivity(intent);
        }
    });



    String text ="";
    try {
        InputStream is = getAssets().open("tujuan1.txt");
        int size = is.available();
        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();
        text = new String(buffer);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    Tujuan1.setText(text);






    }




    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
    super.onBackPressed();
    return true;
            }

}