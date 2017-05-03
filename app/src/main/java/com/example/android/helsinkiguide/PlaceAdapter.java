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

/**
 * Created by icegirlheidi on 17/5/2.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeName = (TextView)listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeStyle = (TextView)listItemView.findViewById(R.id.place_style);
        placeStyle.setText(currentPlace.getPlaceStyle());

        TextView placeDescription = (TextView)listItemView.findViewById(R.id.place_description);
        placeDescription.setText(currentPlace.getPlaceDescription());


        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
