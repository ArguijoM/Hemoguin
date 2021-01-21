package com.example.hemogui_app.ui.tablas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.hemogui_app.ui.Apoyos.Apoyo1_vegetales;
import com.example.hemogui_app.ui.Apoyos.Apoyo2_semillas;
import com.example.hemogui_app.ui.Apoyos.Apoyo3_lacteos;
import com.example.hemogui_app.ui.Apoyos.Apoyo4_cereales;
import com.example.hemogui_app.ui.Apoyos.Apoyo5_aceites_grasas;
import com.example.hemogui_app.ui.Apoyos.Apoyo6_azucares;
import com.example.hemogui_app.ui.Apoyos.Apoyo7_leguminosas;
import com.example.hemogui_app.ui.Apoyos.Apoyo8_alimentos_origen_animal;
import com.example.hemogui_app.ui.Apoyos.Apoyo9_clasificacion;
import com.example.hemogui_app.R;


public class TablasFragment extends Fragment {

    private Button btn_verduraz, btn_frutas, btn_lacteos, btn_cereales,
                   btn_AceiyGrasa,btn_azucares, btn_leguminosas, btn_alimentos_O_A, btn_clasificacion;
    private TablasViewModel tablaViewModel;
    public TablasFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tablaViewModel =
                ViewModelProviders.of(this).get(TablasViewModel.class);
        View root = inflater.inflate(R.layout.activity_tablas, container, false);
        final TextView textView = root.findViewById(R.id.tv_tablas);


        //////////////////// para visualizar los botones ////////////////////////
        btn_verduraz=root.findViewById(R.id.btn_verduras);
        btn_frutas=root.findViewById(R.id.btn_frutas);
        btn_lacteos=root.findViewById(R.id.btn_lacteos);
        btn_cereales=root.findViewById(R.id.btn_cereales);
        btn_AceiyGrasa=root.findViewById(R.id.btn_aceitesygrasas);
        btn_azucares=root.findViewById(R.id.btn_azucares);
        btn_leguminosas=root.findViewById(R.id.btn_legumimosas);
        btn_alimentos_O_A=root.findViewById(R.id.btn_alimentos_O_A);
        btn_clasificacion=root.findViewById(R.id.btn_clasificacion);



        //////////////////////darle acción a los botones //////////////////////////////
        btn_verduraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo1_vegetales.class));
            }
        });
        btn_frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo2_semillas.class));
            }
        });
        btn_lacteos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo3_lacteos.class));
            }
        });
        btn_cereales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo4_cereales.class));
            }
        });
        btn_AceiyGrasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo5_aceites_grasas.class));
            }
        });
        btn_azucares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo6_azucares.class));
            }
        });
        btn_leguminosas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo7_leguminosas.class));
            }
        });
        btn_alimentos_O_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo8_alimentos_origen_animal.class));
            }
        });
        btn_clasificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Apoyo9_clasificacion.class));
            }
        });

        return root;
    }
}