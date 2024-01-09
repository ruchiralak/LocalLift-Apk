package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nothern_province extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2,D3,D4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nothern_province);


        D1 = (CardView) findViewById(R.id.jaffna);
        D2 = (CardView) findViewById(R.id.mannar);
        D3 = (CardView) findViewById(R.id.mulativ);
        D4 = (CardView) findViewById(R.id.vavuniya);


        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);

    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.jaffna:
                i = new Intent(this, N_jaffna.class);
                startActivity(i);
                break;
            case R.id.mannar:
                i = new Intent(this, N_mannar.class);
                startActivity(i);
                break;
            case R.id.mulativ:
                i = new Intent(this,N_mulativ.class);
                startActivity(i);
                break;
            case R.id.vavuniya:
                i = new Intent(this, N_vavuniya.class);
                startActivity(i);
                break;
        }


    }
}