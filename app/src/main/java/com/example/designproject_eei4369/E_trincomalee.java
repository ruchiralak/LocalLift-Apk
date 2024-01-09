package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class E_trincomalee extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etrincomalee);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.588640902532433, 81.21064177945318));
                MapsActivity.start(E_trincomalee.this, markerLocations);


            }
        });


        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.96630539710244, 80.926358649335));
                MapsActivity.start(E_trincomalee.this,markerLocations);

            }
        });


        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.35232740620849, 80.51972280184927));
                MapsActivity.start(E_trincomalee.this,markerLocations);

            }
        });


        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.669521083798491, 80.93778547788469));
                MapsActivity.start(E_trincomalee.this,markerLocations);

            }
        });


        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.586738166781547, 81.00664400877108));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });


        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.644494195182835, 81.17871583276262));
                MapsActivity.start(E_trincomalee.this,markerLocations);

            }
        });


        btn6 = findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.592321073767843, 80.94971317136815));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });


        btn7 = findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.487413787419674, 81.19317268555443));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });


        btn8 = findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.355114527388517, 80.98298460235729));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });


        btn9 = findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.487140091411261, 81.28798159662864));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });


        btn10 = findViewById(R.id.b10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.533115442297799, 81.04206266475435));
                MapsActivity.start(E_trincomalee.this,markerLocations);
            }
        });

    }
}