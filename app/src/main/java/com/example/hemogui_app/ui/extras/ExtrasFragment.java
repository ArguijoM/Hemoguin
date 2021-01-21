package com.example.hemogui_app.ui.extras;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.hemogui_app.R;
import com.example.hemogui_app.ui.Apoyos.Apoyo1_vegetales;

public class ExtrasFragment extends Fragment implements View.OnClickListener {

    View vista;
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ExtrasFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static ExtrasFragment newInstance(String param1, String param2) {
        ExtrasFragment fragment = new ExtrasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.activity_extras, container, false);
        btn1 = vista.findViewById(R.id.boton1);

        btn2 = vista.findViewById(R.id.boton2);
        btn3 = vista.findViewById(R.id.boton3);
        btn4 = vista.findViewById(R.id.boton4);
        btn5 = vista.findViewById(R.id.boton5);
        btn6 = vista.findViewById(R.id.boton6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);


        return vista;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton1:
                startActivity(new Intent(getContext(), Extra_cuidados_vascular.class));
                break;
            case R.id.boton2:
                startActivity(new Intent(getContext(), Extra_signos_alarma.class));
                break;
            case R.id.boton3:
                startActivity(new Intent(getContext(), Extra_cuidado_personal.class));
                break;
            case R.id.boton4:
                startActivity(new Intent(getContext(), Extra_como_banarse.class));
                break;
            case R.id.boton5:
                startActivity(new Intent(getContext(), Extra_higiene_personal.class));
                break;
            case R.id.boton6:
                startActivity(new Intent(getContext(), Extra_generales.class));
                break;
        }
    }
}