package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CheapAdapter extends ArrayAdapter<com.example.android.tourapp.Cheaps> {
    public CheapAdapter(Activity context, ArrayList<com.example.android.tourapp.Cheaps> cheaps) {
        super(context, 0, cheaps);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        com.example.android.tourapp.Cheaps cheaps = getItem(position);

        TextView textView = (TextView)listItemView.findViewById(R.id.text_view);
        textView.setText(cheaps.getMplace());

        ImageView mv=(ImageView)listItemView.findViewById(R.id.image_view);
        mv.setImageResource(cheaps.getMimage());
        return listItemView;
    }
}

