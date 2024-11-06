package com.example.e_modulapp.pengayaan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.e_modulapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;

public class PDF_pengayaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_pengayaan);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Proyek Pengayaan");
        actionBar.setDisplayHomeAsUpEnabled(true);



        PDFView pdfView = (PDFView) findViewById(R.id.pdfpengayaan);
        pdfView.fromAsset("pengayaan7.pdf").load();
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        super.onBackPressed();
        return true;
    }
}