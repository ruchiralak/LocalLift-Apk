package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class S_kegall extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skegall);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.251303477632376, 80.34632201479424));
                MapsActivity.start(S_kegall.this, markerLocations);


            }
        });


        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.254354727568382, 80.44613147811171));
                MapsActivity.start(S_kegall.this,markerLocations);

            }
        });


        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.990301248592605, 80.44194536865606));
                MapsActivity.start(S_kegall.this,markerLocations);

            }
        });


        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.913803984576809, 80.1877716479022));
                MapsActivity.start(S_kegall.this,markerLocations);

            }
        });


        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.189166556185603, 80.43469967547335));
                MapsActivity.start(S_kegall.this,markerLocations);
            }
        });


        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.227897258369905, 80.42899917579852));
                MapsActivity.start(S_kegall.this,markerLocations);

            }
        });


        btn6 = findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.140997038632582, 80.44167164232877));
                MapsActivity.start(S_kegall.this,markerLocations);
            }
        });


        btn7 = findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.952940648570234, 80.24342981349315));
                MapsActivity.start(S_kegall.this,markerLocations);
            }
        });






    }
}