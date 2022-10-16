package com.example.appveterinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Clientes extends AppCompatActivity {

    private String[] clientes = {
            "Beltran Tellez Axel Sebastian",
            "Garcia Leon Gustavo",
            "Jiminez Carrales Angel Ulises",
            "León Lozano Alejandro",
            "Ortiz Beltran Nancy Lilian",
            "Villarreal Sanchez Miguel Angel",
            "Hernandez Rosas Raymundo",
            "Granados Velazquez Juan Jose"};
    private String[] id = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8"};
    private String[] numerotel = {
            "5572036251",
            "5573764470",
            "5518111110",
            "5511534459",
            "5554080457",
            "miguel no found",
            "5515079890",
            "5624169291"};
    private String[] correo = {
            "asbt-duty@hotmail.com",
            "lobitojr@gmail.com",
            "hitlermipapa@gmail.com",
            "alejandroleonlzn@outlook.com",
            "nancybeltran10@hotmail.com",
            "correo no found",
            "correo no found",
            "gavj950110@gmail.com"};
    private ListView lv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);
        lv2=findViewById(R.id.lv2);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,android.R.layout.simple_list_item_1, clientes);
        lv2.setAdapter(adapter);
        //mandar valor
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int j, long l) {
                String idcliente=id[j];
                String nombrecliente=clientes[Integer.parseInt(idcliente)-1];
                String numerocliente=numerotel[Integer.parseInt(idcliente)-1];
                String correocliente=correo[Integer.parseInt(idcliente)-1];
                Intent i = null;
                i = new Intent(getApplicationContext(), verCliente.class);
                //i.putExtra("dato1", edtbuscar.getText().toString());
                i.putExtra("dato1", idcliente);
                i.putExtra("dato2", nombrecliente);
                i.putExtra("dato3", numerocliente);
                i.putExtra("dato4", correocliente);
                startActivity(i);
            }
        });
    }

    public void iniciar (View view){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
    }
}