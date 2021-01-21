package com.example.hemogui_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Piramide_caras extends AppCompatActivity {
    //Actionbar
    private ActionBar actionBar;
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    ImageView imagen_cara1,imagen_cara2,imagen_cara3, imagen_cara4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramide_caras);

        //Inicializacion
        actionBar = getSupportActionBar();
        //Titulo
        actionBar.setTitle("Pirámide de alimentación saludable");
        //Boton Negro
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        imagen_cara1=findViewById(R.id.imagen_cara1);
        imagen_cara2=findViewById(R.id.imagen_cara2);
        imagen_cara3=findViewById(R.id.imagen_cara3);
        imagen_cara4=findViewById(R.id.imagen_cara4);
        //SETEA LA IMAGEN EN EL WIDGET
        imagen_cara1.setImageResource(R.drawable.piramide_nef_1);
        imagen_cara2.setImageResource(R.drawable.piramide_nef_2);
        imagen_cara3.setImageResource(R.drawable.piramide_nef_3);
        imagen_cara4.setImageResource(R.drawable.piramide_nef_4);
        //DEFINE COMO MOSTRAR LA IMAGEN
        imagen_cara1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imagen_cara2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imagen_cara3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imagen_cara4.setScaleType(ImageView.ScaleType.FIT_CENTER);

    }
}