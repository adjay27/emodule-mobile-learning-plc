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
import com.example.e_modulapp.eval_web.Eval_2;
import com.example.e_modulapp.latihan.Latihan_Soal2;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_2;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi2Activity extends AppCompatActivity {
    TextView Tujuan2;
    Button modulshow2;
    Button lat_soal2;
    Button Tes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 2: PEMROGRAMAN PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan2 = (TextView) findViewById(R.id.tujuan2);
        Button modulshow = (Button)findViewById(R.id.materi2go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_2.class);
                startActivity(intent);
            }
        });

        Button lat_soal2 = (Button)findViewById(R.id.lat2go);
        lat_soal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Latihan_Soal2.class);
                startActivity(intent);
            }
        });

        Button Tes2 = (Button)findViewById(R.id.tes2go);
        Tes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_2.class);
                startActivity(intent);
            }
        });

        String text ="";
        try {
            InputStream is = getAssets().open("tujuan2.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan2.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}