package com.example.hemogui_app.ui.guia_nutricion;

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

import com.example.hemogui_app.Alimentacion;
import com.example.hemogui_app.Anemia;
import com.example.hemogui_app.Hemodialisis;
import com.example.hemogui_app.Peso_ingesta;
import com.example.hemogui_app.R;
import com.example.hemogui_app.Hemodialisis;
import com.example.hemogui_app.Receta1_LentArr;
import com.example.hemogui_app.Suplementos;
import com.example.hemogui_app.Tecnicas_cocina;

public class GuiaFragment extends Fragment {
    private Button btn_hemodialisis,btn_anemia_cuidados,btn_aliment,btn_tecnicas_cocina,btn_peso_liquido,btn_suplementos_alimenticios;
    private GuiaViewModel guiaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        guiaViewModel =
                ViewModelProviders.of(this).get(GuiaViewModel.class);
        View root = inflater.inflate(R.layout.activity_guia, container, false);
        final TextView textView = root.findViewById(R.id.tv_guia_n);
       /* guiaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //////////////////// para visualizar los botones ////////////////////////
        btn_hemodialisis= root.findViewById(R.id.btn_hemodialisis);
        btn_anemia_cuidados= root.findViewById(R.id.btn_anemia_cuidados);
        btn_aliment= root.findViewById(R.id.btn_aliment);
        btn_tecnicas_cocina= root.findViewById(R.id.btn_tecnicas_cocina);
        btn_peso_liquido= root.findViewById(R.id.btn_peso_liquido);
        btn_suplementos_alimenticios= root.findViewById(R.id.btn_suplementos_alimenticios);


        //////////////////////darle acción a los botones //////////////////////////////
        btn_hemodialisis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Hemodialisis.class));
            }
        });
        btn_anemia_cuidados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Anemia.class));
            }
        });
        btn_aliment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Alimentacion.class));
            }
        });
        btn_tecnicas_cocina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tecnicas_cocina.class));
            }
        });
        btn_peso_liquido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Peso_ingesta.class));
            }
        });
        btn_suplementos_alimenticios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Suplementos.class));
            }
        });

        return root;



    }
}