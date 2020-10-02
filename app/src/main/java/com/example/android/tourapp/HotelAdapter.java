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

public class HotelAdapter extends ArrayAdapter<famousHotels> {
    public HotelAdapter(Activity context, ArrayList<famousHotels> famoushotels) {
        super(context, 0, famoushotels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        famousHotels famoushotels = getItem(position);

        TextView placename = (TextView)listItemView.findViewById(R.id.text_view);
        placename.setText(famoushotels.getMplace());

        ImageView mv=(ImageView)listItemView.findViewById(R.id.image_view);
        mv.setImageResource(famoushotels.getMimage());
        return listItemView;
    }
}
