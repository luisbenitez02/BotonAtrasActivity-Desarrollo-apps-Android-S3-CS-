package com.example.luisb.botonatrasactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSegundaActividad(View v){
        //a donde estoy y donde quiero ir
        Intent intento = new Intent(this, SegundoActivity.class);
        startActivity(intento);
    }
}
