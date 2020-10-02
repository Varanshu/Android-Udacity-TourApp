package com.example.android.tourapp;

import android.content.Intent;
import android.view.View;

public class FamousClick implements View.OnClickListener {
    public void onClick(View view) {
        Intent j=new Intent(view.getContext(), com.example.android.tourapp.famousPlace.class);
        view.getContext().startActivity(j);
    }
}
