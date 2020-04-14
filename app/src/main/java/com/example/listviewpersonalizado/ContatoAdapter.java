package com.example.listviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ContatoAdapter extends ArrayAdapter<Contato> {
    Context mContext;
    int mResource;

    public ContatoAdapter(Context context, int resource, Contato[] objects){
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        TextView textViewNome = convertView.findViewById(R.id.textViewNome);
        TextView textViewData = convertView.findViewById(R.id.textViewData);
        TextView textViewMensagem = convertView.findViewById(R.id.textViewMensagem);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        Contato contato = getItem(position);

        textViewNome.setText(contato.getNome());
        textViewData.setText(contato.getData());
        textViewMensagem.setText(contato.getMensagem());
        imageView.setImageResource(contato.getImagem());

        return convertView;
    }
}
