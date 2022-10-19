package com.example.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AreaLibra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_libra);
    }

    public void voltarMain(View view){
        Intent intent = new Intent(AreaLibra.this, MainActivity.class);
        startActivity(intent);
    }
}