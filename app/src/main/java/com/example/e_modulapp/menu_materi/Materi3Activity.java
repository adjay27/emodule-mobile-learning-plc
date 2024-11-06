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
import com.example.e_modulapp.eval_web.Eval_3;
import com.example.e_modulapp.jobsheet.Jobsheet_3;
import com.example.e_modulapp.latihan.Latihan_Soal3;
import com.example.e_modulapp.modulpdf.Modul_1;
import com.example.e_modulapp.modulpdf.Modul_3;
import com.example.e_modulapp.ui.materi.MateriFragment;

import java.io.IOException;
import java.io.InputStream;

public class Materi3Activity extends AppCompatActivity {

    TextView Tujuan3;
    Button modulshow3;
    Button jobsheet3;
    Button lat_soal3;
    Button Tes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Materi 3: PENGAWATAN PLC");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Tujuan3 = (TextView) findViewById(R.id.tujuan3);
        Button modulshow = (Button)findViewById(R.id.materi3go);
        modulshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Modul_3.class);
                startActivity(intent);
            }
        });

        Button jobsheet3 = (Button)findViewById(R.id.job3go);
        jobsheet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jobsheet_3.class);
                startActivity(intent);
            }
        });

        Button lat_soal3 = (Button)findViewById(R.id.lat3go);
        lat_soal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Latihan_Soal3.class);
                startActivity(intent);
            }
        });

        Button Tes3 = (Button)findViewById(R.id.tes3go);
        Tes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Eval_3.class);
                startActivity(intent);
            }
        });



        String text ="";
        try {
            InputStream is = getAssets().open("tujuan3.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tujuan3.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}