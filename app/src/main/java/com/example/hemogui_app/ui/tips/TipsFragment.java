package com.example.hemogui_app.ui.tips;

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

import com.example.hemogui_app.R;
import com.example.hemogui_app.ui.ListaTips.Tip1_Potasio;
import com.example.hemogui_app.ui.ListaTips.Tip2_Sodio;
import com.example.hemogui_app.ui.ListaTips.Tip3_Calcio;
import com.example.hemogui_app.ui.ListaTips.Tip4_Fosforo;
import com.example.hemogui_app.ui.ListaTips.Tip5_Azucar;
import com.example.hemogui_app.ui.ListaTips.Tip6_Urea;
import com.example.hemogui_app.ui.ListaTips.Tip7_Hinchazon;

public class TipsFragment extends Fragment {
    private Button btn_potasio, btn_sodio, btn_calcio, btn_fosforo, btn_azucar,btn_urea, btn_hinchazon;
    private TipsViewModel tipViewModel;

    public TipsFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tipViewModel =
                ViewModelProviders.of(this).get(TipsViewModel.class);
        View root = inflater.inflate(R.layout.activity_tips, container, false);
        final TextView textView = root.findViewById(R.id.tv_tips);
        /*recetarioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        //////////////////// para visualizar los botones ////////////////////////
        btn_potasio=root.findViewById(R.id.btn_potasio);
        btn_sodio=root.findViewById(R.id.btn_sodio);
        btn_calcio=root.findViewById(R.id.btn_calcio);
        btn_fosforo=root.findViewById(R.id.btn_fosforo);
        btn_azucar=root.findViewById(R.id.btn_azucar);
        btn_urea=root.findViewById(R.id.btn_urea);
        btn_hinchazon=root.findViewById(R.id.btn_hinchazon);




        //////////////////////darle acción a los botones //////////////////////////////
        btn_potasio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip1_Potasio.class));
            }
        });
        btn_sodio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip2_Sodio.class));
            }
        });
        btn_calcio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip3_Calcio.class));
            }
        });
        btn_fosforo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip4_Fosforo.class));
            }
        });
        btn_azucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip5_Azucar.class));
            }
        });
        btn_urea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip6_Urea.class));
            }
        });
        btn_hinchazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Tip7_Hinchazon.class));
            }
        });
        return root;
    }
}