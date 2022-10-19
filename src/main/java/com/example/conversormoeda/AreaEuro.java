package com.example.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AreaEuro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_euro);
    }

    public void voltarMain(View view){
        Intent intent = new Intent(AreaEuro.this, MainActivity.class);
        startActivity(intent);
    }
}