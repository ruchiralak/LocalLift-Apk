package com.example.designproject_eei4369;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView D1,D2,D3,D4,D5,D6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        D1 = (CardView) findViewById(R.id.video_gallery);
        D2 = (CardView) findViewById(R.id.places);
        D3 = (CardView) findViewById(R.id.compass);
        D4 = (CardView) findViewById(R.id.google_map);
        D5 = (CardView) findViewById(R.id.emergency_contact);
        D6 = (CardView) findViewById(R.id.logouts);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);
        D5.setOnClickListener((View.OnClickListener)this);
        D6.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId())
        {
            case R.id.video_gallery: i =new Intent(this,videoGallery.class); startActivity(i);break;
            case R.id.places: i =new Intent(this,places.class); startActivity(i);break;
            case R.id.compass: i =new Intent(this,compass.class); startActivity(i);break;
            case R.id.google_map: i =new Intent(this,MapsActivity.class); startActivity(i);break;
            case R.id.emergency_contact: i =new Intent(this,Emergency_contacts.class); startActivity(i);break;
            case R.id.logouts:i =new Intent(this,LoginActivity.class);
            startActivity(i);
            break;
        }
    }
}