package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Southern extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2,D3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southern);


        D1 = (CardView) findViewById(R.id.gall);
        D2 = (CardView) findViewById(R.id.matara);
        D3 = (CardView) findViewById(R.id.hambantota);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);


    }

    @Override
    public void onClick(View v) {



        Intent i;
        switch (v.getId()) {
            case R.id.gall:
                i = new Intent(this, Sou_gall.class);
                startActivity(i);
                break;
            case R.id.matara:
                i = new Intent(this, Sou_matara.class);
                startActivity(i);
                break;
            case R.id.hambantota:
                i = new Intent(this,Sou_hambantota.class);
                startActivity(i);
                break;
        }

    }
}