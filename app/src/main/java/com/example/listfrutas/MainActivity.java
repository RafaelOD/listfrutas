package com.example.listfrutas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frutas frutas = new Frutas();

        ArrayList<Fruta> listaFrutas = new ArrayList<>();

        for (Fruta f: frutas.FRUTAS){
            listaFrutas.add(f);
        }

       ListView listView;
        listView=findViewById(R.id.listview);

        FrutaAdapter adapter = new FrutaAdapter(getApplicationContext(),R.layout.layout_lista_personalizada,listaFrutas);

        listView.setAdapter(adapter);

    }
}
