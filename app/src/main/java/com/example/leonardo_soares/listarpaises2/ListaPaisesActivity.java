package com.example.leonardo_soares.listarpaises2;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by leonardo_soares on 26/03/2018.
 * RA 816114026
 */
public class ListaPaisesActivity extends AppCompatActivity {

    public static final String PAIS = "br.usjt.leonardo_soares.listarpaises2.pais";
    Activity atividade;
    Pais[] paises;
    ArrayList<String> nomes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);

        atividade = this;
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        paises = Data.listarPaises(continente);
        nomes = Data.listarNomes(paises);

        ListView listView = (ListView) findViewById(R.id.lista_paises);
        PaisAdapter adapter = new PaisAdapter(paises, this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalhePaisActivity.class);
                intent.putExtra(PAIS, paises[position]);

                startActivity(intent);

            }

        });
    }
}
