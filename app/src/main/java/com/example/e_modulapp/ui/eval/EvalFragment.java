package com.example.e_modulapp.ui.eval;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.e_modulapp.R;
import com.example.e_modulapp.databinding.FragmentEvaluasiBinding;
import com.example.e_modulapp.databinding.FragmentHomeBinding;
import com.example.e_modulapp.eval_web.Eval_1;
import com.example.e_modulapp.eval_web.Eval_2;
import com.example.e_modulapp.eval_web.Eval_3;
import com.example.e_modulapp.eval_web.Eval_4;
import com.example.e_modulapp.eval_web.Eval_5;
import com.example.e_modulapp.eval_web.Eval_6;
import com.example.e_modulapp.eval_web.Eval_7;

public class EvalFragment extends Fragment {

    public EvalFragment() {

    }

    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_evaluasi,container,false);
        Button button = (Button) view.findViewById(R.id.tesform1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_1.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) view.findViewById(R.id.tesform2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_2.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) view.findViewById(R.id.tesform3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_3.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) view.findViewById(R.id.tesform4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_4.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) view.findViewById(R.id.tesform5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_5.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) view.findViewById(R.id.tesform6);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_6.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) view.findViewById(R.id.tesform7);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Eval_7.class);
                startActivity(intent);
            }
        });
        return view;
    }

}