package com.example.e_modulapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class TentangActivity extends AppCompatActivity {
    TextView Pengembang;
    TextView Pembimbing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        Pengembang = (TextView)findViewById(R.id.pengembang);
        Pembimbing = (TextView)findViewById(R.id.pembimbing);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Tentang");
        actionBar.setDisplayHomeAsUpEnabled(true);

        String text ="";
        try {
            InputStream is = getAssets().open("pengembang.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Pengembang.setText(text);

        String text2 ="";
        try {
            InputStream is = getAssets().open("pembimbing.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text2 = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Pembimbing.setText(text2);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        return true;
    }
}