package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class N_jaffna extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_njaffna);

        //jaffna
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.764708672765932, 80.09297137194228));
                MapsActivity.start(N_jaffna.this, markerLocations);


            }
        });

        //Nallur Kandasvami Kovil
        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.674786129980582, 80.02952973068076));
                MapsActivity.start(N_jaffna.this,markerLocations);

            }
        });

        //Jaffna Fort
        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.662096804033107, 80.0084252));
                MapsActivity.start(N_jaffna.this,markerLocations);

            }
        });

        //Nagadeepa Temple
        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.612935263774535, 79.77419823068077));
                MapsActivity.start(N_jaffna.this,markerLocations);

            }
        });

        //Grape farming
        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.80992925864184, 80.02616689371499));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });

        //Chundikulam National Park
        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.514484137597579, 80.53258698039329));
                MapsActivity.start(N_jaffna.this,markerLocations);

            }
        });

        //Museum
        btn6 = findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.669509299038616, 80.0247343073827));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });

        //Kidom  Ruins
        btn7 = findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.678340486398216, 80.03619270326608));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });

        //Fort Hammenheil
        btn8 = findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.722122820983184, 79.84521943854308));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });

        //Point Pedro
        btn9 = findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.827040985552678, 80.24977494417547));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });
        //Sacred water spring
        btn10 = findViewById(R.id.b10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(9.815168266804102, 80.01150059204234));
                MapsActivity.start(N_jaffna.this,markerLocations);
            }
        });


    }
}