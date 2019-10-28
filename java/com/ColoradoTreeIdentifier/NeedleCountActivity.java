package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class NeedleCountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needle_count);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


    }

    public void goToFiveNeedle(View view){
        Intent intent = new Intent(this, FiveNeedle.class);
        startActivity(intent);
    }
    public void goToTwoNeedle(View view){
        Intent intent = new Intent(this, TwoNeedle.class);
        startActivity(intent);
    }

    public void goToPonderosa(View view){
        Intent intent = new Intent(this, PonderosaPine.class);
        startActivity(intent);
    }

    public void goToOneNeedle(View view){
        Intent intent = new Intent(this, OneNeedle.class);
        startActivity(intent);
    }

}
