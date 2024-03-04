package com.example.filapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertirBoton = findViewById(R.id.convertirBoton);
        convertirBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*"); // Selecciona todos los tipos de archivos
                startActivity(intent);
            }
        });
        Button imprimirBoton = findViewById(R.id.imprimirBoton);
        imprimirBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("application/pdf,image/jpeg,image/jpg,image/png"); // Selecciona todos los tipos de archivos
                startActivity(intent);
            }
        });
        Button unirBoton = findViewById(R.id.unirBoton);
        unirBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("application/pdf"); // Selecciona todos los tipos de archivos
                startActivity(intent);
            }
        });
    }
}