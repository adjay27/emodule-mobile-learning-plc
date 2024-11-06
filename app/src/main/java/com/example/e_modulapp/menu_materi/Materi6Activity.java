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
import com.example.e_modulapp.eval_web.Eval_6;
import com.example.e_modulapp.jobsheet.Jobsheet_6;
import com.example.e_modulapp.latihan.Latihan_Soal6;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_6;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi6Activity extends AppCompatActivity {
    TextView Tujuan6;
    Button modulshow;
    Button jobsheet6;
    Button lat_soal6;
    Button Tes6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi6);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 6: TROUBLESHOOTING PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan6 = (TextView) findViewById(R.id.tujuan6);
        Button modulshow = (Button)findViewById(R.id.materi6go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_6.class);
                startActivity(intent);
            }
        });

        Button jobsheet6 = (Button)findViewById(R.id.job6go);
        jobsheet6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jobsheet_6.class);
                startActivity(intent);
            }
        });

        Button lat_soal6 = (Button)findViewById(R.id.lat6go);
        lat_soal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Latihan_Soal6.class);
                startActivity(intent);
            }
        });
        Button Tes6 = (Button)findViewById(R.id.tes6go);
        Tes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_6.class);
                startActivity(intent);
            }
        });

        String text ="";
        try {
            InputStream is = getAssets().open("tujuan6.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan6.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}