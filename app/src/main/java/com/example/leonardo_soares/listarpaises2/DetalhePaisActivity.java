package com.example.leonardo_soares.listarpaises2;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhePaisActivity extends AppCompatActivity {
    /**
     * Created by leonardo_soares on 26/03/2018.
     * RA 816114026
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        TextView txtPais = (TextView)findViewById(R.id.txtPais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaisesActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
