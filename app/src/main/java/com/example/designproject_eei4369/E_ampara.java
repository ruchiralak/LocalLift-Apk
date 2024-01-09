package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class E_ampara extends AppCompatActivity {

    Button btn, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eampara);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.301764236183469, 81.67428376808338));
                MapsActivity.start(E_ampara.this, markerLocations);


            }
        });


        btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.63237860671767, 81.78797709032533));
                MapsActivity.start(E_ampara.this,markerLocations);

            }
        });


        btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.353167050383757, 81.85868831719172));
                MapsActivity.start(E_ampara.this,markerLocations);

            }
        });


        btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.297848448132005, 81.86574420351585));
                MapsActivity.start(E_ampara.this,markerLocations);

            }
        });


        btn4 = findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.023257966710778, 81.84804649335577));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });


        btn5 = findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.024541044545157, 81.87868425709546));
                MapsActivity.start(E_ampara.this,markerLocations);

            }
        });


        btn6 = findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.884594026519708, 81.79388361301372));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });


        btn7 = findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.868103936976636, 81.8389968711644));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });


        btn8 = findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.851015035688635, 81.70240397246548));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });


        btn9 = findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.819796499748817, 81.82376868226007));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });


        btn10 = findViewById(R.id.b10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.7571724873098695, 81.81735973832005));
                MapsActivity.start(E_ampara.this,markerLocations);
            }
        });

    }
}