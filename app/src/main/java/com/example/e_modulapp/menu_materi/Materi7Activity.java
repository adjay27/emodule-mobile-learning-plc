package com.example.e_modulapp.menu_materi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_modulapp.R;
import com.example.e_modulapp.eval_web.Eval_1;
import com.example.e_modulapp.eval_web.Eval_7;
import com.example.e_modulapp.jobsheet.Jobsheet_7;
import com.example.e_modulapp.latihan.Latihan_Soal7;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_7;
import com.example.e_modulapp.pengayaan.Pengayaan_7;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi7Activity extends AppCompatActivity {
    TextView Tujuan7;
    Button modulshow;
    Button jobsheet7;

    Button pengayaan7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi7);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 7: APLIKASI PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan7 = (TextView) findViewById(R.id.tujuan7);
        Button modulshow = (Button)findViewById(R.id.materi7go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_7.class);
                startActivity(intent);
            }
        });
        Button jobsheet7 = (Button)findViewById(R.id.job7go);
        jobsheet7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jobsheet_7.class);
                startActivity(intent);
            }
        });

        Button pengayaan7 = (Button)findViewById(R.id.pengayaan7go);
        pengayaan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Pengayaan_7.class);
                startActivity(intent);
            }
        });
        Button Tes7 = (Button)findViewById(R.id.tes7go);
        Tes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_7.class);
                startActivity(intent);
            }
        });

        String text ="";
        try {
            InputStream is = getAssets().open("tujuan7.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan7.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}