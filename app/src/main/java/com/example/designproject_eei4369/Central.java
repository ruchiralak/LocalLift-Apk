package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Central extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2,D3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);

        D1 = (CardView) findViewById(R.id.matale);
        D2 = (CardView) findViewById(R.id.kandy);
        D3 = (CardView) findViewById(R.id.nuwaraeliya);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);


    }
    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.matale:
                i = new Intent(this, C_matale.class);
                startActivity(i);
                break;
            case R.id.kandy:
                i = new Intent(this, C_kandy.class);
                startActivity(i);
                break;
            case R.id.nuwaraeliya:
                i = new Intent(this, C_nuwaraeliya.class);
                startActivity(i);
                break;
        }
    }
}