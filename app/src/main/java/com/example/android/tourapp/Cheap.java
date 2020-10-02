package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Cheap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheap);
        ArrayList<com.example.android.tourapp.Cheaps> cheaps=new ArrayList<com.example.android.tourapp.Cheaps>();
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings14_xml),R.drawable.rest1));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings15_xml),R.drawable.rest2));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings16_xml),R.drawable.rest3));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings17_xml),R.drawable.rest4));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings18_xml),R.drawable.rest5));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings19_xml),R.drawable.rest6));
        cheaps.add(new com.example.android.tourapp.Cheaps(getString(R.string.strings20_xml),R.drawable.rest7));

        com.example.android.tourapp.CheapAdapter cheapAdapter = new com.example.android.tourapp.CheapAdapter(this,cheaps);
        ListView listView = (ListView)findViewById(R.id.cheap_restaurants);
        listView.setAdapter(cheapAdapter);
    }
}
