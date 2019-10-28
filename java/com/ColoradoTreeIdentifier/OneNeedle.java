package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OneNeedle
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_needle);
    }
    public void goToSpruce(View view){
        Intent intent = new Intent(this, Spruce.class);
        startActivity(intent);
    }
    public void goToFir(View view){
        Intent intent = new Intent(this, Fir.class);
        startActivity(intent);
    }
}
