package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class mytour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytour);

        TextView textView=(TextView)findViewById(R.id.famous_places1);
        FamousClick famousClick=new FamousClick();
        textView.setOnClickListener(famousClick);

        TextView textView1=(TextView)findViewById(R.id.best_restaurant);
        CheapClick cheapClick=new CheapClick();
        textView1.setOnClickListener(cheapClick);

        TextView textView2=(TextView)findViewById(R.id.famous_streets);
        com.example.android.tourapp.StreetsClick streetsClick=new com.example.android.tourapp.StreetsClick();
        textView2.setOnClickListener(streetsClick);

        TextView textView3=(TextView)findViewById(R.id.famous_hotels);
        HotelsClick hotelsClick=new HotelsClick();
        textView3.setOnClickListener(hotelsClick);
    }
}
