package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class N_mannar extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nmannar);

        //Mannar
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.0498006827966, 79.82245441895003));
                MapsActivity.start(N_mannar.this, markerLocations);


            }
        });

        //Adam’s bridge – Mannar
        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.136400550712438, 79.50631456604962));
                MapsActivity.start(N_mannar.this,markerLocations);

            }
        });

        //Talaimannar Pier and Lighthouse
        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.107591292793465, 79.7310115775325));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });

        //Mannar Fort
        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.975983069406366, 79.9170071288351));
                MapsActivity.start(N_mannar.this,markerLocations);

            }
        });

        // Baobab Tree – Mannar
        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.982769029244611, 79.9227931543701));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });

        //Talaimannar Sand Dunes
        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.087840884406422, 79.74017758706262));
                MapsActivity.start(N_mannar.this,markerLocations);

            }
        });

        //Kudiramalai Point
        btn6 = findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.539973456976904, 79.87353071291975));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });

        //National Shrine of Our Lady of Madu Church
        btn7 = findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.855189815305339, 80.20366812030244));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });

        //Mannar Bird Sanctuary
        btn8 = findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.931913778506187, 79.9214178846596));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });

        //Keeri Beach
        btn9 = findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.983631297225285, 79.87128137485627));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });
        //Fishing Village Experience
        btn10 = findViewById(R.id.b10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.983764425086425, 79.92563399757935));
                MapsActivity.start(N_mannar.this,markerLocations);
            }
        });


    }
}