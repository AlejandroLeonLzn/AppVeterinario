package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar (View view){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
    }
    public void olvide (View view){
        Intent i = new Intent(this,OlviContra.class);
        startActivity(i);
    }
}