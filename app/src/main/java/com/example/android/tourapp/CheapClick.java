package com.example.android.tourapp;

import android.content.Intent;
import android.view.View;

public class CheapClick implements View.OnClickListener {
    public void onClick(View view) {
        Intent j=new Intent(view.getContext(),Cheap.class);
        view.getContext().startActivity(j);
    }
}
