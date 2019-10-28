package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FiveNeedle extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_needle);
    }
    public void goToBristleCone(View view){
        Intent intent = new Intent(this, BristleCone.class);
        startActivity(intent);
    }
    public void goToLimberPine(View view) {
        Intent intent = new Intent(this, LimberPine.class);
        startActivity(intent);
    }
}
