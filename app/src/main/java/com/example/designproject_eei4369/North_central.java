package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class North_central extends AppCompatActivity implements View.OnClickListener{

    private CardView D1,D2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_central);

        D1 = (CardView) findViewById(R.id.anuradhapura);
        D2 = (CardView) findViewById(R.id.polonnaruwa);


        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);



    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.anuradhapura:
                i = new Intent(this,NC_anuradhapura.class);
                startActivity(i);
                break;
            case R.id.polonnaruwa:
                i = new Intent(this, NC_polonnaruwa.class);
                startActivity(i);
                break;

        }



    }
}