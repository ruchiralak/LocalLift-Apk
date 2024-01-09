package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Uva extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uva);


        D1 = (CardView) findViewById(R.id.badulla);
        D2 = (CardView) findViewById(R.id.moneragala);


        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);


    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.badulla:
                i = new Intent(this,U_badulla.class);
                startActivity(i);
                break;
            case R.id.moneragala:
                i = new Intent(this, U_moneragala.class);
                startActivity(i);
                break;

        }

    }
}