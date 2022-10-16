package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Mascotas extends AppCompatActivity {
    private String[] mascotas = {"Bartho", "Firulais", "Solin", "Bellota", "Tiro", "Pudin", "Caramelo", "Lula", "Timoty", "Kirara"};
    private String[] id = {"1","2","3","4","5","6","7","8","9","10"};
    private String[] tipo = {"1","1","1","1","1","2","1","1","2","2"};
    private String[] color = {"Blanco con negro","Blanco con negro","Negro","Cafe","Cafe","Gris atrigado","Negro con Cafe","Naranja con Blanco","Gris","Atigrado cafe"};
    private String[] tam = {"Grande","Mediano","Pequeño","Grande","Miniatura","Mediano","Grande","Mediano","Grande","Mediano"};
    private String[] vacu = {"parmovirus \n Rabia","sin vacunas","Rabia","Parmovirus","Rabia","TripleGatuna","Rabia","Gripe Perruna","Rabia","Sin Vacunas"};
    private ListView lv1;
    private EditText edtbuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);
        lv1=findViewById(R.id.lv1);
        edtbuscar=findViewById(R.id.edtbuscar);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,android.R.layout.simple_list_item_1, mascotas);
        lv1.setAdapter(adapter);
        //mandar valor
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int j, long l) {
                //edtbuscar.setText("id: " + lv1.getItemAtPosition(j) + " es " + id[j]);
                String idmascota=id[j];
                String nombremascota=mascotas[Integer.parseInt(idmascota)-1];
                String tipomascota=tipo[j];
                String colormascota=color[j];
                String tamamascota=tam[j];
                String vacunamascota=vacu[j];
                Intent i = null;
                i = new Intent(getApplicationContext(), VerMascota.class);
                //i.putExtra("dato1", edtbuscar.getText().toString());
                i.putExtra("dato1", idmascota);
                i.putExtra("dato2", nombremascota);
                i.putExtra("dato3", tipomascota);
                i.putExtra("dato4", colormascota);
                i.putExtra("dato5", tamamascota);
                i.putExtra("dato6", vacunamascota);
                startActivity(i);
            }
            });


    }

    public void iniciar (View view){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
    }
}