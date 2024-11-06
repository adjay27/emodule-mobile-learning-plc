package com.example.e_modulapp.ui.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.e_modulapp.R;
import com.example.e_modulapp.video.Video1;
import com.example.e_modulapp.video.Video3;
import com.example.e_modulapp.video.Video4;
import com.example.e_modulapp.video.Video5;
import com.example.e_modulapp.video.Video6;

public class VideoFragment extends Fragment {


    TextView cardView2;

    TextView cardView4;
    TextView cardView5;


    public VideoFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video,container,false);


        TextView cardView2  = (TextView)view.findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Video3.class);
                startActivity(intent);
            }
        });


        TextView cardView4  = (TextView)view.findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Video5.class);
                startActivity(intent);
            }
        });
        TextView cardView5  = (TextView)view.findViewById(R.id.card5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Video6.class);
                startActivity(intent);
            }
        });

    return view;
    }

}
