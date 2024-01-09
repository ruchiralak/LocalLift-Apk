package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class U_badulla extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubadulla);



        btn1 = findViewById(R.id.b1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.990834892296932, 81.05764319479319));
                MapsActivity.start(U_badulla.this, markerLocations);


            }
        });

        btn2 = findViewById(R.id.b2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.985070256965672, 81.06122730599768));
                MapsActivity.start(U_badulla.this,markerLocations);






            }
        });

        btn3 = findViewById(R.id.b3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.9370808441330745, 81.11683759707276));
                MapsActivity.start(U_badulla.this,markerLocations);






            }
        });

        btn4 = findViewById(R.id.b4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.008935002599554, 80.99639106736761));
                MapsActivity.start(U_badulla.this,markerLocations);






            }
        });
        //Dunhida Ella
        btn5 = findViewById(R.id.b5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.017821834550291, 81.06356814616198));
                MapsActivity.start(U_badulla.this,markerLocations);






            }
        });
        //Gala Muduna Temple
        btn6 = findViewById(R.id.b6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.070943481954826, 81.13084057612242));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });
        //Cave Madulsima
        btn7 = findViewById(R.id.b7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.054074866734046, 81.16949935993341));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });
        //Dimbulana Hills
        btn8 = findViewById(R.id.b8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.019018090067361, 80.9913855568455));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });
        //Kandahena Ella
        btn9 = findViewById(R.id.b9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.8740469308755445, 81.1424254827543));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });
        //Idalgashinna Campsite
        btn10 = findViewById(R.id.b10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.780074605686537, 80.8911242737187));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

          //Haldummulla Portuguese Fort
        btn11 = findViewById(R.id.b11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.784706722824466, 80.88567019879103));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

         //Weliwanguwa
        btn12 = findViewById(R.id.b12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.775716084765502, 80.83164503478594));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

        //Nine Arch
        btn13 = findViewById(R.id.b13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.876985519511538, 81.06100742802879));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

        //Ella
        btn14 = findViewById(R.id.b14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.960116280899834, 80.85255280060188));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

        //Lipton Seat
        btn15 = findViewById(R.id.b15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.781040383018056, 81.01552635412966));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });

        //uwa halpewwatte tea factory
        btn16 = findViewById(R.id.b16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.889469366388097, 81.03451752433025));
                MapsActivity.start(U_badulla.this,markerLocations);

            }
        });



    }
}