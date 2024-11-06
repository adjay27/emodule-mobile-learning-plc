package com.example.e_modulapp.modulpdf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_modulapp.HomeActivity;
import com.example.e_modulapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Modul_7 extends AppCompatActivity {
    FloatingActionButton mFab, mNext_fab, mPrev_fab, mHome_fab;
    TextView mNext_fab_text, mPrev_fab_text, mHome_fab_text;
    Boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul7);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Kembali");
        actionBar.setDisplayHomeAsUpEnabled(true);

        PDFView pdfView = (PDFView) findViewById(R.id.modul7pdf);
        pdfView.fromAsset("modul7.pdf").load();

        mFab = findViewById(R.id.Fab);
        mNext_fab = findViewById(R.id.Next_fab);
        mPrev_fab = findViewById(R.id.Prev_fab);
        mHome_fab = findViewById(R.id.Home_fab);

        mNext_fab_text = findViewById(R.id.Next_fab_text);
        mPrev_fab_text = findViewById(R.id.Prev_fab_text);
        mHome_fab_text = findViewById(R.id.Home_fab_text);
        mHome_fab.setVisibility(View.GONE);
        mNext_fab.setVisibility(View.GONE);
        mPrev_fab.setVisibility(View.GONE);
        mPrev_fab_text.setVisibility(View.GONE);
        mNext_fab_text.setVisibility(View.GONE);
        mHome_fab_text.setVisibility(View.GONE);


        isAllFabsVisible = false;

        mFab.setOnClickListener(view -> {
            if(!isAllFabsVisible) {
                mHome_fab.show();
                mNext_fab.show();
                mPrev_fab.show();
                mPrev_fab_text.setVisibility(View.VISIBLE);
                mNext_fab_text.setVisibility(View.VISIBLE);
                mHome_fab_text.setVisibility(View.VISIBLE);
                isAllFabsVisible = true;
            } else {
                mHome_fab.hide();
                mNext_fab.hide();
                mPrev_fab.hide();
                mPrev_fab_text.setVisibility(View.GONE);
                mNext_fab_text.setVisibility(View.GONE);
                mHome_fab_text.setVisibility(View.GONE);

                isAllFabsVisible =false;
            }
        });

        mHome_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul_7.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        mNext_fab.setOnClickListener(view -> Toast.makeText(Modul_7.this,"Anda Telah Mencapai Batas Maksimal Halaman",Toast.LENGTH_SHORT).show());
        mPrev_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul_7.this, Modul_6.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        super.onBackPressed();
        return true;
    }

}