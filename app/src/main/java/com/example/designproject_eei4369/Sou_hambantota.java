package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class Sou_hambantota extends AppCompatActivity {

    Button btn, btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sou_hambantota);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.142773362419611, 81.1209657840744));
                MapsActivity.start(Sou_hambantota.this, markerLocations);


            }
        });


        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.153436094766902, 81.06603249636939));
                MapsActivity.start(Sou_hambantota.this,markerLocations);

            }
        });


        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.491661294708575, 81.47536528293709));
                MapsActivity.start(Sou_hambantota.this,markerLocations);

            }
        });


        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.215382387323348, 81.09025089602734));
                MapsActivity.start(Sou_hambantota.this,markerLocations);

            }
        });

    }
}