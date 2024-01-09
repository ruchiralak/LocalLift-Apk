package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Western extends AppCompatActivity implements View.OnClickListener{

    private CardView D1,D2,D3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western);


        D1 = (CardView) findViewById(R.id.gampaha);
        D2 = (CardView) findViewById(R.id.kaluthara);
        D3 = (CardView) findViewById(R.id.colombo);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);


    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.gampaha:
                i = new Intent(this, W_gampaha.class);
                startActivity(i);
                break;
            case R.id.kaluthara:
                i = new Intent(this, W_kaluthara.class);
                startActivity(i);
                break;
            case R.id.colombo:
                i = new Intent(this, W_colombo.class);
                startActivity(i);
                break;
        }

    }
}