package com.example.android.helsinkiguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        // If there is no view for recycling, then inflate current list item to listItemView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get current item of place
        Place currentPlace = getItem(position);

        // Get the place name view
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        // Set the place name of current place to be text.
        placeName.setText(currentPlace.getPlaceName());

        // Get the place style view
        TextView placeStyle = (TextView) listItemView.findViewById(R.id.place_style);
        // Set the place style of current place to be text
        placeStyle.setText(currentPlace.getPlaceStyle());

        // Get the place description view
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_simple_description);
        // Set the simple description of current place to be text
        placeDescription.setText(currentPlace.getPlaceSimpleDescription());

        // Get the image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set image resource Id
        imageView.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}
