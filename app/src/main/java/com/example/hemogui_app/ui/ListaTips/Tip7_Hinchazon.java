package com.example.hemogui_app.ui.ListaTips;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hemogui_app.R;

public class Tip7_Hinchazon extends AppCompatActivity {

    //Actionbar
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip7_hinchazon);

        //Inicializacion
        actionBar = getSupportActionBar();
        //Titulo
        actionBar.setTitle("Tips nutricion");
        //Boton Negro
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

    }
}
