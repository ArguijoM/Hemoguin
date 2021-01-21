package com.example.hemogui_app.ui.recetario;

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
import com.example.hemogui_app.Receta10_HuevRellAtu;
import com.example.hemogui_app.Receta11_filete_pollo;
import com.example.hemogui_app.Receta12_hamburguesa_pollo;
import com.example.hemogui_app.Receta13_albondigas_salsa;
import com.example.hemogui_app.Receta14_arroz_leche;
import com.example.hemogui_app.Receta1_LentArr;
import com.example.hemogui_app.Receta2_EnslArroz;
import com.example.hemogui_app.Receta3_CroqAtun;
import com.example.hemogui_app.Receta4_FiletPesca;
import com.example.hemogui_app.Receta5_PurePapa;
import com.example.hemogui_app.Receta6_PolloHorno;
import com.example.hemogui_app.Receta7_FiletRes;
import com.example.hemogui_app.Receta8_ChamAjo;
import com.example.hemogui_app.Receta9_HuevoChamp;

public class RecetarioFragment extends Fragment {

    private Button btn_lentejasArroz, btn_ensalArroz, btn_croqAtun, btn_filetPesca, btn_purePapa,
                    btn_polloHorno, btn_fielRes, btn_ChamAjo, btn_huevoChamp, btn_huevoRellAtu,btn_filete_pollo,
    btn_hamburguesa_pollo, btn_albondigas_salsa,btn_arroz_leche;
    private RecetarioViewModel recetarioViewModel;

    public RecetarioFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recetarioViewModel =
                ViewModelProviders.of(this).get(RecetarioViewModel.class);
        View root = inflater.inflate(R.layout.activity_recetario, container, false);
        final TextView textView = root.findViewById(R.id.tv_recetario);


        //////////////////// para visualizar los botones ////////////////////////
        btn_lentejasArroz=root.findViewById(R.id.btn_lentejasArroz);
        btn_ensalArroz=root.findViewById(R.id.btn_ensalArroz);
        btn_croqAtun=root.findViewById(R.id.btn_croqAtun);
        btn_filetPesca=root.findViewById(R.id.btn_filetPesc);
        btn_purePapa=root.findViewById(R.id.btn_purePapa);
        btn_polloHorno=root.findViewById(R.id.btn_polloHorno);
        btn_fielRes=root.findViewById(R.id.btn_filetRes);
        btn_ChamAjo=root.findViewById(R.id.btn_champAjo);
        btn_huevoChamp=root.findViewById(R.id.btn_huevoChamp);
        btn_huevoRellAtu=root.findViewById(R.id.btn_hevoRellAtun);
        btn_filete_pollo=root.findViewById(R.id.btn_filete_pollo);
        btn_hamburguesa_pollo=root.findViewById(R.id.btn_hamburguesa_pollo);
        btn_albondigas_salsa=root.findViewById(R.id.btn_albondigas_salsa);
        btn_arroz_leche=root.findViewById(R.id.btn_arroz_leche);



        //////////////////////darle acción a los botones //////////////////////////////
        btn_lentejasArroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta1_LentArr.class));
            }
        });
        btn_ensalArroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta2_EnslArroz.class));
            }
        });
        btn_croqAtun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta3_CroqAtun.class));
            }
        });
        btn_filetPesca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta4_FiletPesca.class));
            }
        });
        btn_purePapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta5_PurePapa.class));
            }
        });
        btn_polloHorno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta6_PolloHorno.class));
            }
        });
        btn_fielRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta7_FiletRes.class));
            }
        });
        btn_ChamAjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta8_ChamAjo.class));
            }
        });
        btn_huevoChamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta9_HuevoChamp.class));
            }
        });
        btn_huevoRellAtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta10_HuevRellAtu.class));
            }
        });
        btn_filete_pollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta11_filete_pollo.class));
            }
        });
        btn_hamburguesa_pollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta12_hamburguesa_pollo.class));
            }
        });
        btn_albondigas_salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta13_albondigas_salsa.class));
            }
        });
        btn_arroz_leche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Receta14_arroz_leche.class));
            }
        });
        return root;
    }
}