package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void salir (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void mascotas (View view){
        Intent i = new Intent(this,Mascotas.class);
        startActivity(i);
    }
    public void clientes (View view){
        Intent i = new Intent(this,Clientes.class);
        startActivity(i);
    }
    public void consulta (View view){
        Intent i = new Intent(this,Consulta.class);
        startActivity(i);
    }
    public void venta (View view){
        Intent i = new Intent(this,Venta.class);
        startActivity(i);
    }
}