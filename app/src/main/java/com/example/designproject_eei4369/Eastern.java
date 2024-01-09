package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eastern extends AppCompatActivity implements View.OnClickListener {


    private CardView D1,D2,D3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastern);

        D1 = (CardView) findViewById(R.id.ampara);
        D2 = (CardView) findViewById(R.id.trincomalee);
        D3 = (CardView) findViewById(R.id.batticola);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);


    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.ampara:
                i = new Intent(this, E_ampara.class);
                startActivity(i);
                break;
            case R.id.trincomalee:
                i = new Intent(this, E_trincomalee.class);
                startActivity(i);
                break;
            case R.id.batticola:
                i = new Intent(this, E_batticola.class);
                startActivity(i);
                break;
        }

    }
}