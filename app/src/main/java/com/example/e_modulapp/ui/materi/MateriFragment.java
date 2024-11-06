package com.example.e_modulapp.ui.materi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
;

import com.example.e_modulapp.R;
import com.example.e_modulapp.menu_materi.Materi1Activity;
import com.example.e_modulapp.menu_materi.Materi2Activity;
import com.example.e_modulapp.menu_materi.Materi3Activity;
import com.example.e_modulapp.menu_materi.Materi4Activity;
import com.example.e_modulapp.menu_materi.Materi5Activity;
import com.example.e_modulapp.menu_materi.Materi6Activity;
import com.example.e_modulapp.menu_materi.Materi7Activity;

public class MateriFragment extends Fragment {

    ImageButton materi1_button;
    ImageButton materi2_button;
    ImageButton materi3_button;
    ImageButton materi4_button;
    ImageButton materi5_button;
    ImageButton materi6_button;
    ImageButton materi7_button;

   public MateriFragment() {

   }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_materi,container,false);

        ImageButton materi1_button = (ImageButton) view.findViewById(R.id.materi1button);
        materi1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Materi1Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi2_button = (ImageButton) view.findViewById(R.id.materi2button);
        materi2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi3_button = (ImageButton) view.findViewById(R.id.materi3button);
        materi3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi3Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi4_button = (ImageButton) view.findViewById(R.id.materi4button);
        materi4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi4Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi5_button = (ImageButton) view.findViewById(R.id.materi5button);
        materi5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi5Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi6_button = (ImageButton) view.findViewById(R.id.materi6button);
        materi6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi6Activity.class);
                startActivity(intent);
            }
        });

        ImageButton materi7_button = (ImageButton) view.findViewById(R.id.materi7button);
        materi7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Materi7Activity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}