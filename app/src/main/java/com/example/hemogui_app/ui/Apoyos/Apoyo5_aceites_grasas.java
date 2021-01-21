package com.example.hemogui_app.ui.Apoyos;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hemogui_app.R;

public class Apoyo5_aceites_grasas extends AppCompatActivity {

    //Actionbar
    private ActionBar actionBar;
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apoyo5_aceites_grasas);

        //Inicializacion
        actionBar = getSupportActionBar();
        //Titulo
        actionBar.setTitle("Tablas de Apoyo");
        //Boton Negro
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

    }
}
