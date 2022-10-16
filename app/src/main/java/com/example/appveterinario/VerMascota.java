package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class VerMascota extends AppCompatActivity {

    private ImageView fotoMascota;
    private EditText nomMascot, tipMascot, colorMascot, tamMascot, vacMascot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_mascota);

        nomMascot = (EditText) findViewById(R.id.nomMascot);
        tipMascot = (EditText) findViewById(R.id.tipMascot);
        colorMascot = (EditText) findViewById(R.id.colorMascot);
        tamMascot = (EditText) findViewById(R.id.tamMascot);
        vacMascot = (EditText) findViewById(R.id.vacMascot);
        fotoMascota = (ImageView) findViewById(R.id.fotoMascota);


        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");
        String dato3=getIntent().getStringExtra("dato3");
        String dato4=getIntent().getStringExtra("dato4");
        String dato5=getIntent().getStringExtra("dato5");
        String dato6=getIntent().getStringExtra("dato6");
        int imagen=Integer.parseInt(dato1);
        int catdog=Integer.parseInt(dato3);

        nomMascot.setText(" "+dato2);
        if (1 == catdog){
            tipMascot.setText("Perro");
        }else if(2 == catdog){
            tipMascot.setText("Gato");
        }
        colorMascot.setText(" "+dato4);
        tamMascot.setText(" "+dato5);
        vacMascot.setText(" "+dato6);

        if(1 == imagen){
            fotoMascota.setImageResource(R.drawable.m1);
        } else if(2 == imagen) {
            fotoMascota.setImageResource(R.drawable.m2);
        } else if(3 == imagen) {
            fotoMascota.setImageResource(R.drawable.m3);
        } else if(4 == imagen) {
            fotoMascota.setImageResource(R.drawable.m4);
        } else if(5 == imagen) {
            fotoMascota.setImageResource(R.drawable.m5);
        } else if(6 == imagen) {
            fotoMascota.setImageResource(R.drawable.m6);
        } else if(7 == imagen) {
            fotoMascota.setImageResource(R.drawable.m7);
        } else if(8 == imagen) {
            fotoMascota.setImageResource(R.drawable.m8);
        } else if(9 == imagen) {
            fotoMascota.setImageResource(R.drawable.m9);
        } else if(10 == imagen) {
            fotoMascota.setImageResource(R.drawable.m10);
        }

    }

    public void Regresar (View view){
        Intent i = new Intent(this,Mascotas.class);
        startActivity(i);
    }
}