package com.example.e_modulapp.jobsheet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.e_modulapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Jobsheet_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobsheet3);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Kembali");
        actionBar.setDisplayHomeAsUpEnabled(true);

        PDFView pdfView = (PDFView) findViewById(R.id.jobsheet3pdf);
        pdfView.fromAsset("jobsheet_3.pdf").load();
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        super.onBackPressed();
        return true;
    }
}