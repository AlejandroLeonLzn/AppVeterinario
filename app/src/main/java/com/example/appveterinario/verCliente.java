package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class verCliente extends AppCompatActivity {

    private ImageView fotoCliente;
    private EditText nomCliente, telCliente, correoCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_cliente);

        nomCliente = (EditText) findViewById(R.id.nomCliente);
        telCliente = (EditText) findViewById(R.id.telCliente);
        correoCliente = (EditText) findViewById(R.id.correoCliente);
        fotoCliente = (ImageView) findViewById(R.id.fotoCliente);

        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");
        String dato3=getIntent().getStringExtra("dato3");
        String dato4=getIntent().getStringExtra("dato4");

        nomCliente.setText(" "+dato2);
        telCliente.setText(" "+dato3);
        correoCliente.setText(" "+dato4);
        int imagen=Integer.parseInt(dato1);
        if(1 == imagen){
            fotoCliente.setImageResource(R.drawable.c1);
        } else if(2 == imagen) {
            fotoCliente.setImageResource(R.drawable.c2);
        } else if(3 == imagen) {
            fotoCliente.setImageResource(R.drawable.c3);
        } else if(4 == imagen) {
            fotoCliente.setImageResource(R.drawable.c4);
        } else if(5 == imagen) {
            fotoCliente.setImageResource(R.drawable.c5);
        } else if(6 == imagen) {
            fotoCliente.setImageResource(R.drawable.m6);
        } else if(7 == imagen) {
            fotoCliente.setImageResource(R.drawable.m7);
        } else if(8 == imagen) {
            fotoCliente.setImageResource(R.drawable.c8);
        }
    }

    public void Regresar (View view){
        Intent i = new Intent(this,Clientes.class);
        startActivity(i);
    }
}