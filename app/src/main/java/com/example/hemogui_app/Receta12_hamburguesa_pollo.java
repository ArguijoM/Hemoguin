package com.example.hemogui_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Receta12_hamburguesa_pollo extends AppCompatActivity {


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
        setContentView(R.layout.activity_receta12_hamburguesa_pollo);

        //Inicializacion
        actionBar = getSupportActionBar();
        //Titulo
        actionBar.setTitle("Receta");
        //Boton Negro
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
}