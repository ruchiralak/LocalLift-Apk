package com.example.designproject_eei4369;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//The code defines a class called DataParser which contains methods
// for parsing JSON data related to Google Places.
public class DataParser {

    //The getPlace method takes a JSONObject representing a Google Place and extracts relevant information from it.
    // It creates a HashMap called googlePlaceMap to store the extracted data.
    private HashMap<String, String> getPlace(JSONObject googlePlaceJson)
    {
        HashMap<String, String> googlePlaceMap = new HashMap<>();
        //The method retrieves the place name and vicinity (address) from the JSON object.
        // If these values are not present, it assigns "--NA--" as the default value.
        String placeName = "--NA--";
        String vicinity= "--NA--";

        //The latitude and longitude coordinates are extracted from the JSON object's nested structure.
        // The method accesses the "geometry" object, then its "location" object, and retrieves the latitude and longitude values as strings.
        String latitude= "";
        String longitude="";

        //The method also retrieves the reference value from the JSON object.
        String reference="";
        Log.d("DataParser","jsonobject ="+googlePlaceJson.toString());

        //The extracted data (place name, vicinity, latitude, longitude, and reference)
        // are stored in the googlePlaceMap HashMap.
        try {
            if (!googlePlaceJson.isNull("name")) {
                placeName = googlePlaceJson.getString("name");
            }
            if (!googlePlaceJson.isNull("vicinity")) {
                vicinity = googlePlaceJson.getString("vicinity");
            }

            latitude = googlePlaceJson.getJSONObject("geometry").getJSONObject("location").getString("lat");
            longitude = googlePlaceJson.getJSONObject("geometry").getJSONObject("location").getString("lng");

            reference = googlePlaceJson.getString("reference");

            googlePlaceMap.put("place_name", placeName);
            googlePlaceMap.put("vicinity", vicinity);
            googlePlaceMap.put("lat", latitude);
            googlePlaceMap.put("lng", longitude);
            googlePlaceMap.put("reference", reference);

        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return googlePlaceMap;
    }
    //It calls the getPlaces method, passing the JSONArray, to obtain the list of place data.
    private List<HashMap<String, String>>getPlaces(JSONArray jsonArray)
    {
        int count = jsonArray.length();
        List<HashMap<String, String>> placelist = new ArrayList<>();
        HashMap<String, String> placeMap = null;

        for(int i = 0; i<count;i++)
        {
            try {
                placeMap = getPlace((JSONObject) jsonArray.get(i));
                placelist.add(placeMap);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return placelist;
    }

   //The list of place data is returned as the output of the parse method.
    public List<HashMap<String, String>> parse(String jsonData)
    {
        JSONArray jsonArray = null;
        JSONObject jsonObject;

        //The code also includes logging statements using Log.d to output certain information for debugging purposes.
        Log.d("json data", jsonData);

        try {
            jsonObject = new JSONObject(jsonData);
            jsonArray = jsonObject.getJSONArray("results");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getPlaces(jsonArray);
    }
}
