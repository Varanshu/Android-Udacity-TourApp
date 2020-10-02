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

public class StreetsAdapter extends ArrayAdapter<famousStreets> {
    public StreetsAdapter(Activity context, ArrayList<famousStreets> famousstreets) {
        super(context, 0, famousstreets);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        famousStreets famousstreets = getItem(position);

        TextView placename = (TextView)listItemView.findViewById(R.id.text_view);
        placename.setText(famousstreets.getMplace());

        ImageView mv=(ImageView)listItemView.findViewById(R.id.image_view);
        mv.setImageResource(famousstreets.getMimage());
        return listItemView;
    }

}
