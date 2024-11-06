package com.example.e_modulapp.ui.home;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.e_modulapp.DafpusActivity;
import com.example.e_modulapp.HomeActivity;
import com.example.e_modulapp.PendahuluanActivity;
import com.example.e_modulapp.PetunjukActivity;
import com.example.e_modulapp.R;
import com.example.e_modulapp.RpsActivity;
import com.example.e_modulapp.TentangActivity;
public class HomeFragment extends Fragment {
    ImageButton pendButton;
    ImageButton petunjukButton;
    ImageButton rpsButton;
    ImageButton dafpusButton;
    ImageButton tentangButton;
    ImageButton exitButton;
    public HomeFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton pendButton = (ImageButton)view.findViewById(R.id.pend_button);
        pendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PendahuluanActivity.class);
                ((HomeActivity)getActivity()).startActivity(intent);
            }
        });
        ImageButton petunjukButton = (ImageButton) view.findViewById(R.id.petunjuk_button);
        petunjukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PetunjukActivity.class);
                ((HomeActivity)getActivity()).startActivity(intent);
            }
        });
        ImageButton rpsButton = (ImageButton) view.findViewById(R.id.rps_button);
        rpsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RpsActivity.class);
                ((HomeActivity)getActivity()).startActivity(intent);
            }
        });
        ImageButton dafpusButton = (ImageButton) view.findViewById(R.id.dafpus_button);
        dafpusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DafpusActivity.class);
                ((HomeActivity)getActivity()).startActivity(intent);
            }
        });

        ImageButton tentangButton = (ImageButton) view.findViewById(R.id.tentang_button);
        tentangButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TentangActivity.class);
                ((HomeActivity)getActivity()).startActivity(intent);
            }
        });

        ImageButton exitButton = (ImageButton) view.findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new AlertDialog.Builder(view.getContext())
                        .setTitle("KELUAR")
                        .setMessage("Apakah Anda Yakin Ingin Keluar?")
                        .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("TIDAK", null)
                        .show();
            }
        });

        return view;
    }
}




