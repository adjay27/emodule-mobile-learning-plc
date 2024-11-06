package com.example.e_modulapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class RpsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("RPS");
        actionBar.setDisplayHomeAsUpEnabled(true);


        PDFView pdfView = (PDFView) findViewById(R.id.pdfrps);
        pdfView.fromAsset("RPS.pdf").load();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return true;
    }
}