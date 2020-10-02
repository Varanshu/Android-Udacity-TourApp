package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Streets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streets);

        ArrayList<famousStreets> famousstreets=new ArrayList<famousStreets>();
        famousstreets.add(new famousStreets(getString(R.string.strings21_xml),R.drawable.street1));
        famousstreets.add(new famousStreets(getString(R.string.strings22_xml),R.drawable.street2));
        famousstreets.add(new famousStreets(getString(R.string.string23_xml),R.drawable.street3));
        famousstreets.add(new famousStreets(getString(R.string.strings24_xml),R.drawable.street4));
        famousstreets.add(new famousStreets(getString(R.string.strings25_xml),R.drawable.street5));
        famousstreets.add(new famousStreets(getString(R.string.strings26_xml),R.drawable.street6));
        famousstreets.add(new famousStreets(getString(R.string.strings27_xml),R.drawable.street7));

        com.example.android.tourapp.StreetsAdapter streetsAdapter = new com.example.android.tourapp.StreetsAdapter(this,famousstreets);
        ListView listView = (ListView)findViewById(R.id.famous_streets);
        listView.setAdapter(streetsAdapter);
    }
}
