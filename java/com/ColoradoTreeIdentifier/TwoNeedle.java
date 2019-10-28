package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TwoNeedle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_needle);
    }
    public void goToPinyonPine(View view){
        Intent intent = new Intent(this, PinyonPine.class);
        startActivity(intent);
    }
    public void goToLodgePolePine(View view) {
        Intent intent = new Intent(this, LodgepolePine.class);
        startActivity(intent);
    }
}
