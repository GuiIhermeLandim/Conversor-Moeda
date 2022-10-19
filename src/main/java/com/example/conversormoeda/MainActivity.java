package com.example.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaDolar(View view){
        Intent intent = new Intent(MainActivity.this, AreaDolar.class);
        startActivity(intent);
    }

    public void telaEuro(View view){
        Intent intent = new Intent(MainActivity.this, AreaEuro.class);
        startActivity(intent);
    }

    public void telaLibra(View view){
        Intent intent = new Intent(MainActivity.this, AreaLibra.class);
        startActivity(intent);
    }

}