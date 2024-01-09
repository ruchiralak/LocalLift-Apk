package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sabaragamuwa extends AppCompatActivity  implements View.OnClickListener{

    private CardView D1,D2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabaragamuwa);


        D1 = (CardView) findViewById(R.id.kegall);
        D2 = (CardView) findViewById(R.id.rathnapura);


        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.kegall:
                i = new Intent(this,S_kegall.class);
                startActivity(i);
                break;
            case R.id.rathnapura:
                i = new Intent(this, S_rathnapura.class);
                startActivity(i);
                break;

        }


    }
}