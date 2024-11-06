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
import com.example.e_modulapp.eval_web.Eval_4;
import com.example.e_modulapp.jobsheet.Jobsheet_4;
import com.example.e_modulapp.latihan.Latihan_Soal4;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_4;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi4Activity extends AppCompatActivity {

    TextView Tujuan4;
    Button modulshow;
    Button jobsheet4;
    Button lat_soal4;
    Button Tes4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi4);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 4: TRANSFER PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan4 = (TextView) findViewById(R.id.tujuan4);
        Button modulshow = (Button)findViewById(R.id.materi4go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_4.class);
                startActivity(intent);
            }
        });

        Button jobsheet4 = (Button)findViewById(R.id.job4go);
        jobsheet4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jobsheet_4.class);
                startActivity(intent);
            }
        });

        Button lat_soal4 = (Button)findViewById(R.id.lat4go);
        lat_soal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Latihan_Soal4.class);
                startActivity(intent);
            }
        });
        Button Tes4 = (Button)findViewById(R.id.tes4go);
        Tes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_4.class);
                startActivity(intent);
            }
        });

        String text ="";
        try {
            InputStream is = getAssets().open("tujuan4.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan4.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}