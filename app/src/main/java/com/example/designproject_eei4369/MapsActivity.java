package com.example.designproject_eei4369;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.designproject_eei4369.databinding.ActivityMapsBinding;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener
        {

    private GoogleMap mMap;
    ArrayList markerPoints= new ArrayList();
    public static final int REQUEST_LOCATION_CODE = 99;
    private List<LatLng> markerLocations;

    private LatLng userLocation;
    private ActivityMapsBinding binding;
    private static final int LOCATION_PERMISSION_CODE=101;
    private GoogleApiClient client;
    private LocationRequest locationRequest;
    private Location lastlocation;
    private Marker currentLocationMarker;
    double latitude,longitude;
    int PROXIMITY_RADIUS = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        if (isLocationPermissionGranted()){
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }
        else {
            //request location permission
            requestLocationPermission();
        }
        // Get the marker locations from the intent extras
        markerLocations = getIntent().getParcelableArrayListExtra("markerLocations");

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //Request runtime permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            bulidGoogleApiClient();
            mMap.setMyLocationEnabled(true);
        }

        if (markerLocations != null) {
            for (LatLng location : markerLocations) {
                MarkerOptions options = new MarkerOptions()
                        .position(location)
                        .title("Marker Title")
                        .snippet("Marker Description");
                mMap.addMarker(options);
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 6.0f));
                mMap.getUiSettings().setZoomControlsEnabled(true);
            }
        }
        if (googleMap != null) {
            googleMap.setMyLocationEnabled(true);
        }


    }
    //Check the location Permission Granted or not
    private boolean isLocationPermissionGranted(){
        return ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
        == PackageManager.PERMISSION_GRANTED;
    }
    //request location permission
    private void requestLocationPermission(){
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                LOCATION_PERMISSION_CODE);
    }
            @Override
            public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

                super.onRequestPermissionsResult(requestCode, permissions, grantResults);

                switch (requestCode) {
                    case REQUEST_LOCATION_CODE:
                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                                if (client == null) {
                                    bulidGoogleApiClient();
                                }
                                mMap.setMyLocationEnabled(true);
                            }
                        } else {
                            Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
                        }
                }
            }
            //This code creates an instance of the GoogleApiClient class using its builder pattern, sets up connection callbacks and APIs, and initiates a connection to the client.
            // The method is declared as synchronized to avoid concurrency issues.
            protected synchronized void bulidGoogleApiClient() {
                client = new GoogleApiClient.Builder(this)
                        .addConnectionCallbacks(this)
                        .addOnConnectionFailedListener(this)
                        .addApi(LocationServices.API)
                        .build();
                client.connect();

            }
            // Static method to start the MapsActivity with the marker locations
    public static void start(Context context, List<LatLng> markerLocations) {
        Intent intent = new Intent(context, MapsActivity.class);
        intent.putParcelableArrayListExtra("markerLocations", new ArrayList<>(markerLocations));
        context.startActivity(intent);
    }

    ///////////////////////////////Menu///////////////////////////

            @Override
            public boolean onCreateOptionsMenu(Menu m) {

                getMenuInflater().inflate(R.menu.mymenu,m);

                return true;
            }

            @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id){
                    case R.id.about:
                        Toast.makeText(this,"This app developed by Ruchira Lakshan",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.logout:
                        finish();
                        Toast.makeText(this,"Log Out Successfull", Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
            ////////////////////menu///////////

            //This code implements the onConnected() method of the GoogleApiClient.ConnectionCallbacks interface.
            // Within this method, a new instance of LocationRequest is created, which specifies the desired parameters for location updates.
            @Override
            public void onConnected(@Nullable Bundle bundle) {
                locationRequest = new LocationRequest();
                locationRequest.setInterval(100);
                locationRequest.setFastestInterval(1000);
                locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

                if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION ) == PackageManager.PERMISSION_GRANTED)
                {
                    LocationServices.FusedLocationApi.requestLocationUpdates(client, locationRequest, this);
                }
            }

            @Override
            public void onConnectionSuspended(int i) {

            }

            @Override
            public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

            }

            //This method is called when the location of the device is changed. The new location is passed as a parameter to the method.
            @Override
            public void onLocationChanged(@NonNull Location location) {

                latitude = location.getLatitude();
                longitude = location.getLongitude();
                lastlocation = location;
                if(currentLocationMarker != null)
                {
                    currentLocationMarker.remove();

                }
                Log.d("lat = ",""+latitude);
                LatLng latLng = new LatLng(location.getLatitude() , location.getLongitude());
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(latLng);
                markerOptions.title("Current Location");
                markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
                currentLocationMarker = mMap.addMarker(markerOptions);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                mMap.animateCamera(CameraUpdateFactory.zoomBy(8));

                if(client != null)
                {
                    LocationServices.FusedLocationApi.removeLocationUpdates(client,this);
                }
    }
            //It creates an object array to pass to a GetNearbyPlacesData object, which is then executed.
            // The data transfer object contains the map and the URL for the nearby places.
            public void onClick(View v)
            {
                Object[] dataTransfer = new Object[2];
                GetNearbyPlacesData getNearbyPlacesData = new GetNearbyPlacesData();

                switch(v.getId())
                {
                    case R.id.B_search:
                        EditText tf_location =  findViewById(R.id.TF_location);
                        String location = tf_location.getText().toString();
                        List<Address> addressList;


                        if(!location.equals(""))
                        {
                            Geocoder geocoder = new Geocoder(this);

                            try {
                                addressList = geocoder.getFromLocationName(location, 5);

                                if(addressList != null)
                                {
                                    for(int i = 0;i<addressList.size();i++)
                                    {
                                        LatLng latLng = new LatLng(addressList.get(i).getLatitude() , addressList.get(i).getLongitude());
                                        MarkerOptions markerOptions = new MarkerOptions();
                                        markerOptions.position(latLng);
                                        markerOptions.title(location);
                                        mMap.addMarker(markerOptions);
                                        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                                        mMap.animateCamera(CameraUpdateFactory.zoomTo(11));
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case R.id.B_hopistals:
                        mMap.clear();
                        String hospital = "hospital";
                        String url = getUrl(latitude, longitude, hospital);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby Hospitals", Toast.LENGTH_LONG).show();
                        break;


                    case R.id.B_schools:
                        mMap.clear();
                        String school = "school";
                        url = getUrl(latitude, longitude, school);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby Schools", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.B_restaurants:
                        mMap.clear();
                        String resturant = "restuarant";
                        url = getUrl(latitude, longitude, resturant);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby Restaurants", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.B_atm:
                        mMap.clear();
                        String atm = "atm";
                        url = getUrl(latitude, longitude, atm);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby ATMs...", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.B_lib:
                        mMap.clear();
                        String lib = "library";
                        url = getUrl(latitude, longitude, lib);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby Libraries...", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.B_gym:
                        mMap.clear();
                        String g = "gym";
                        url = getUrl(latitude, longitude, g);
                        dataTransfer[0] = mMap;
                        dataTransfer[1] = url;

                        getNearbyPlacesData.execute(dataTransfer);
                        Toast.makeText(MapsActivity.this, "Searching Nearby Gyms...", Toast.LENGTH_LONG).show();
                        break;
                }
            }
            //This method generates a URL for the Google Places API web service using the latitude and longitude of the current location,
            // the radius of the search, the type of nearby place to search for, and a unique API key.
            private String getUrl(double latitude , double longitude , String nearbyPlace)
            {

                StringBuilder googlePlaceUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
                googlePlaceUrl.append("location="+latitude+","+longitude);
                googlePlaceUrl.append("&radius="+PROXIMITY_RADIUS);
                googlePlaceUrl.append("&type="+nearbyPlace);
                googlePlaceUrl.append("&sensor=true");
                googlePlaceUrl.append("&key="+"AIzaSyDPkWe8Tf2xclxq9wWUka_KWBPCBjhL5OQ");

                Log.d("MapsActivity", "url = "+googlePlaceUrl.toString());

                return googlePlaceUrl.toString();
            }
        }