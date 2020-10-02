package com.example.android.tourapp;

import android.content.Intent;
import android.view.View;

public class HotelsClick implements View.OnClickListener {
    public void onClick(View view) {
        Intent j=new Intent(view.getContext(),Hotels.class);
        view.getContext().startActivity(j);
    }
}
