package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList<Contato> arrayList = new ArrayList<Contato>();

        ContatoController contatoController = new ContatoController();

        ContatoAdapter contatoAdapter = new ContatoAdapter(
                getApplicationContext(),
                R.layout.list_item_contato,
                contatoController.contato
            );

        listView.setAdapter(contatoAdapter);
    }
}
