package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class famousPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_place);

        ArrayList<com.example.android.tourapp.Places> places=new ArrayList<com.example.android.tourapp.Places>();
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings7_xml),R.drawable.bandra));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings8_xml),R.drawable.andheri));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings9_xml),R.drawable.borivali));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings10_xml),R.drawable.central));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings11_xml),R.drawable.virar));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings12_xml),R.drawable.khar));
        places.add(new com.example.android.tourapp.Places(getString(R.string.strings13_xml),R.drawable.santacruz));

        com.example.android.tourapp.PlacesAdapter placesAdapter = new com.example.android.tourapp.PlacesAdapter(this,places);
        ListView listView = (ListView)findViewById(R.id.famous_places);
        listView.setAdapter(placesAdapter);
    }
}
