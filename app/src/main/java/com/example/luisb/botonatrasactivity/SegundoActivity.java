package com.example.luisb.botonatrasactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//activo el boton de ir atras
    }
}
