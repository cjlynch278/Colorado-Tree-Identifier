package com.ColoradoTreeIdentifier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Spruce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spruce);
    }


    public void goToBlueSpruce(View view){
        Intent intent = new Intent(this, BlueSpruce.class);
        startActivity(intent);
    }

    public void goToEngelmannSpruce(View view){
        Intent intent = new Intent(this, EngelmannSpruce.class);
        startActivity(intent);
    }

}