package com.example.e_modulapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.e_modulapp.R;
import com.example.e_modulapp.ui.home.HomeFragment;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

public class PendahuluanActivity extends AppCompatActivity {
    TextView pendahuluan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendahuluan);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Pendahuluan");
        actionBar.setDisplayHomeAsUpEnabled(true);

        pendahuluan = (TextView) findViewById(R.id.textpend);
        String text ="";
        try {
            InputStream is = getAssets().open("pendahuluan.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        pendahuluan.setText(text);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        return true;
    }
}