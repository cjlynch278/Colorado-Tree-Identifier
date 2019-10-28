package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fir);
    }
    public void goToWhiteFir(View view){
        Intent intent = new Intent(this, WhiteFir.class);
        startActivity(intent);
    }
    public void goToSubAlpineFir(View view){
        Intent intent = new Intent(this, SubAlpineFir.class);
        startActivity(intent);
    }
    public void goToDouglassFir(View view){
        Intent intent = new Intent(this, DouglasFir.class);
        startActivity(intent);
    }
}
