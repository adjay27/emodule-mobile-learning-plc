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
import com.example.e_modulapp.eval_web.Eval_5;
import com.example.e_modulapp.jobsheet.Jobsheet_3;
import com.example.e_modulapp.jobsheet.Jobsheet_5;
import com.example.e_modulapp.latihan.Latihan_Soal5;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_5;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi5Activity extends AppCompatActivity {
    TextView Tujuan5;
    Button modulshow;
    Button jobsheet5;
    Button lat_soal5;
    Button Tes5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi5);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 5: PENGOPERASIAN PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan5 = (TextView) findViewById(R.id.tujuan5);
        Button modulshow = (Button)findViewById(R.id.materi5go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_5.class);
                startActivity(intent);
            }
        });

        Button jobsheet5 = (Button)findViewById(R.id.job5go);
        jobsheet5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jobsheet_5.class);
                startActivity(intent);
            }
        });
        Button lat_soal5 = (Button)findViewById(R.id.lat5go);
        lat_soal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Latihan_Soal5.class);
                startActivity(intent);
            }
        });
        Button Tes5 = (Button)findViewById(R.id.tes5go);
        Tes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_5.class);
                startActivity(intent);
            }
        });
        String text ="";
        try {
            InputStream is = getAssets().open("tujuan5.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan5.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}