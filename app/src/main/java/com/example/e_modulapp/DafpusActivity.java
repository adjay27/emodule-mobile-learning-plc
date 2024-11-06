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

public class DafpusActivity extends AppCompatActivity {
    TextView dafpus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dafpus);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Daftar Pustaka");
        actionBar.setDisplayHomeAsUpEnabled(true);
        dafpus = (TextView) findViewById(R.id.textdafpus);
        String text ="";
        try {
            InputStream is = getAssets().open("pustaka.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        dafpus.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        return true;
    }
}