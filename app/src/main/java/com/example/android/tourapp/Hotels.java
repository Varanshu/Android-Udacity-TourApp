package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<com.example.android.tourapp.famousHotels> famoushotels=new ArrayList<com.example.android.tourapp.famousHotels>();
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings_xml),R.drawable.hotel1));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings1_xml),R.drawable.hotel2));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings2_xml),R.drawable.hotel3));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings3_xml),R.drawable.hotel4));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings4_xml),R.drawable.hotel5));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings5_xml),R.drawable.hotel6));
        famoushotels.add(new com.example.android.tourapp.famousHotels(getString(R.string.strings6_xml),R.drawable.jw));

        com.example.android.tourapp.HotelAdapter hotelAdapter = new com.example.android.tourapp.HotelAdapter(this,famoushotels);
        ListView listView = (ListView)findViewById(R.id.famous_hotels);
        listView.setAdapter(hotelAdapter);
    }
}
