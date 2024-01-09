package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class N_vavuniya extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvavuniya);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.754682441659385, 80.49483276396849));
                MapsActivity.start(N_vavuniya.this, markerLocations);


            }
        });


        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.746006336871476, 80.52996120365589));
                MapsActivity.start(N_vavuniya.this,markerLocations);

            }
        });


        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.753819777251932, 80.4988369711644));
                MapsActivity.start(N_vavuniya.this,markerLocations);

            }
        });


        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.756453960590614, 80.50087557116439));
                MapsActivity.start(N_vavuniya.this,markerLocations);

            }
        });


        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.875816663316117, 80.73645540499966));
                MapsActivity.start(N_vavuniya.this,markerLocations);
            }
        });


        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(8.568651027814344, 80.4818819291097));
                MapsActivity.start(N_vavuniya.this,markerLocations);

            }
        });


    }
}