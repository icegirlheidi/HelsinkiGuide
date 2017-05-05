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
 * Created by icegirlheidi on 17/5/4.
 */

public class DetailsAdapter extends ArrayAdapter<Place> {

    public DetailsAdapter(Context context, ArrayList<Place> placeDetails) {
        super(context, 0, placeDetails);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_details_list_item, parent,false);
        }

        Place currentPlaceDetails = getItem(position);

        TextView detailsPlaceName = (TextView)listItemView.findViewById(R.id.details_place_name);
        detailsPlaceName.setText(currentPlaceDetails.getPlaceName());

        TextView detailsPlaceStyle = (TextView)listItemView.findViewById(R.id.details_place_style);
        detailsPlaceStyle.setText(currentPlaceDetails.getPlaceStyle());

        ImageView detailsImage = (ImageView)listItemView.findViewById(R.id.details_image);
        detailsImage.setImageResource(currentPlaceDetails.getImageResourceId());

        TextView detailsPlaceDescription = (TextView)listItemView.findViewById(R.id.details_place_description);
        detailsPlaceDescription.setText(currentPlaceDetails.getPlaceDescription());

        TextView detailsPlaceAddress = (TextView)listItemView.findViewById(R.id.address);
        detailsPlaceAddress.setText(currentPlaceDetails.getPlaceAddress());

        TextView detailsPlaceTelephone = (TextView)listItemView.findViewById(R.id.telephone);
        detailsPlaceTelephone.setText(currentPlaceDetails.getPlaceTelephone());

        TextView detailsPlaceWebsite = (TextView)listItemView.findViewById(R.id.website);
        detailsPlaceWebsite.setText(currentPlaceDetails.getPlaceWebsite());

        TextView detailsPlaceOpenTime = (TextView)listItemView.findViewById(R.id.open_time);
        detailsPlaceOpenTime.setText(currentPlaceDetails.getPlaceOpenTime());


        TextView detailsPlacePrice = (TextView)listItemView.findViewById(R.id.price);
        detailsPlaceOpenTime.setText(currentPlaceDetails.getPlaceOpenTime());

        return listItemView;
    }

}
