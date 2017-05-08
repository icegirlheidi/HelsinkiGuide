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
 * Created by icegirlheidi on 17/5/3.
 */

public class SeePlaceAdapter extends ArrayAdapter<Place> {
    public SeePlaceAdapter(Context context, ArrayList<Place> seePlaces) {
        super(context, 0, seePlaces);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.see_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.see_image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        TextView placeNameTextView = (TextView)listItemView.findViewById(R.id.see_place_name);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView placeStyleTextView = (TextView) listItemView.findViewById(R.id.see_place_style);
        placeStyleTextView.setText(currentPlace.getPlaceStyle());

        return listItemView;
    }
}
