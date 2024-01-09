package com.example.designproject_eei4369;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
public class U_moneragala extends AppCompatActivity {
   Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umoneragala);

        btn1 = findViewById(R.id.mone_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.8924278674919215, 81.34809474906056));
                MapsActivity.start(U_moneragala.this, markerLocations);
            }
        });

        btn2 = findViewById(R.id.m2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.684940401287691, 81.07947908186424));
                MapsActivity.start(U_moneragala.this,markerLocations);

            }
        });

        btn3 = findViewById(R.id.m3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.418667019121346, 81.3334171720682));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn4 = findViewById(R.id.m4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.78160063613277, 81.08577151079037));
                MapsActivity.start(U_moneragala.this,markerLocations);

            }
        });

        btn5 = findViewById(R.id.m5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.9170749622303935, 81.38754741238672));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn6 =findViewById(R.id.m6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.607700463538529, 81.53391910739713));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn7 =findViewById(R.id.m7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.440210044168615, 81.29720658199749));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn8 =findViewById(R.id.m8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.424120092676123, 81.33255685870958));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn9 =findViewById(R.id.m9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(7.035667086332416, 81.54648175192607));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn10 =findViewById(R.id.m10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.980570222931363, 81.50117369352205));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });

        btn11 =findViewById(R.id.m11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<LatLng> markerLocations = new ArrayList<>();
                markerLocations.add(new LatLng(6.900341815604513, 81.34500475871383));
                MapsActivity.start(U_moneragala.this,markerLocations);
            }
        });


    }
}