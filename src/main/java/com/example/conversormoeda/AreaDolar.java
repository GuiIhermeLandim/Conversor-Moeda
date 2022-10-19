package com.example.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AreaDolar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_dolar);
    }

    public void voltarMain(View view){
        Intent intent = new Intent(AreaDolar.this, MainActivity.class);
        startActivity(intent);
    }
}