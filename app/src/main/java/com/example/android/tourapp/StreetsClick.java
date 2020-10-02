package com.example.android.tourapp;

import android.content.Intent;
import android.view.View;

public class StreetsClick implements View.OnClickListener {
    public void onClick(View view) {
        Intent j=new Intent(view.getContext(),Streets.class);
        view.getContext().startActivity(j);
    }
}
