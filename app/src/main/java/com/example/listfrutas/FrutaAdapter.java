package com.example.listfrutas;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class FrutaAdapter extends ArrayAdapter {

    int mresource;
    Context mcontext;


    public FrutaAdapter(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);

        mresource = resource;
        mcontext =  context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =  LayoutInflater.from(mcontext);

        convertView = inflater.inflate(mresource,parent,false);

        Fruta fruta = (Fruta) getItem(position);

        TextView lblcodigo = convertView.findViewById(R.id.lblCodigo);
        TextView lblpreco = convertView.findViewById(R.id.lblPreco);
        TextView lblnome = convertView.findViewById(R.id.lblFruta);
        TextView lblprecovenda = convertView.findViewById(R.id.lblPrecoVenda);
        ImageView img  = convertView.findViewById(R.id.imageView);

        lblcodigo.setText(String.valueOf(fruta.getCodigo()));
        lblpreco.setText(fruta.getPreco().toString());
        lblnome.setText(String.valueOf(fruta.getNome()));
        lblprecovenda.setText(String.valueOf(fruta.getPreco_venda().toString()));

        img.setImageResource(fruta.getImagem());

        return convertView;
    }
}
