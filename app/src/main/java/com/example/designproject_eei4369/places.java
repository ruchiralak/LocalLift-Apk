package com.example.designproject_eei4369;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class places extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2,D3,D4,D5,D6,D7,D8,D9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        D1 = (CardView) findViewById(R.id.north);
        D2 = (CardView) findViewById(R.id.Ncentral);
        D3 = (CardView) findViewById(R.id.Nwestern);
        D4 = (CardView) findViewById(R.id.central);
        D5 = (CardView) findViewById(R.id.eastern);
        D6 = (CardView) findViewById(R.id.Sabaragamuwa);
        D7 = (CardView) findViewById(R.id.Western);
        D8 = (CardView) findViewById(R.id.southern);
        D9 = (CardView) findViewById(R.id.uva);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);
        D5.setOnClickListener((View.OnClickListener)this);
        D6.setOnClickListener((View.OnClickListener)this);
        D7.setOnClickListener((View.OnClickListener)this);
        D8.setOnClickListener((View.OnClickListener)this);
        D9.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId())
        {
            case R.id.north: i =new Intent(this,Nothern_province.class); startActivity(i);break;
            case R.id.Ncentral: i =new Intent(this,North_central.class); startActivity(i);break;
            case R.id.Nwestern: i =new Intent(this,North_western.class); startActivity(i);break;
            case R.id.central: i =new Intent(this,Central.class); startActivity(i);break;
            case R.id.eastern: i =new Intent(this,Eastern.class); startActivity(i);break;
            case R.id.Western: i =new Intent(this,Western.class); startActivity(i);break;
            case R.id.southern: i =new Intent(this,Southern.class); startActivity(i);break;
            case R.id.Sabaragamuwa: i =new Intent(this,Sabaragamuwa.class); startActivity(i);break;
            case R.id.uva: i =new Intent(this,Uva.class); startActivity(i);break;
        }
    }
}