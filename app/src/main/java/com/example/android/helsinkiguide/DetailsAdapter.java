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


public class DetailsAdapter extends ArrayAdapter<Place> {
    public DetailsAdapter(Context context, ArrayList<Place> detailsPlaces) {
        super(context, 0, detailsPlaces);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_details_list_item, parent, false);
        }

        // Get details of current place
        Place currentDetailsPlace = getItem(position);

        // Set the place name to be name of current place
        TextView placeNameTextView = (TextView)listItemView.findViewById(R.id.details_place_name);
        placeNameTextView.setText(currentDetailsPlace.getPlaceName());

        // Set the style to be the style of current place
        TextView placeStyleTextView = (TextView) listItemView.findViewById(R.id.details_place_style);
        placeStyleTextView.setText(currentDetailsPlace.getPlaceStyle());

        // Set the image resource Id to be the image resource Id of current place
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.details_image);
        placeImageView.setImageResource(currentDetailsPlace.getImageResourceId());

        // Set the description to be the description of current place
        TextView detailsPlaceDescription = (TextView) listItemView.findViewById(R.id.details_place_description);
        detailsPlaceDescription.setText(currentDetailsPlace.getPlaceDescription());

        // Set the address to be the address of current place
        TextView detailsPlaceAddress = (TextView) listItemView.findViewById(R.id.address);
        detailsPlaceAddress.setText(currentDetailsPlace.getPlaceAddress());

        // Set the telephone number to be the telephone number of current place
        TextView detailsPlaceTelephone = (TextView) listItemView.findViewById(R.id.telephone);
        detailsPlaceTelephone.setText(currentDetailsPlace.getPlaceTelephone());

        // Set the website to be the website of current place
        TextView detailsPlaceWebsite = (TextView) listItemView.findViewById(R.id.website);
        detailsPlaceWebsite.setText(currentDetailsPlace.getPlaceWebsite());

        // Get the view of title More
        TextView moreInfoTitle = (TextView) listItemView.findViewById(R.id.details_more_info_title);

        // Set the opening time to be the opening time of current place
        TextView detailsPlaceOpenTime = (TextView) listItemView.findViewById(R.id.open_time);
        if (currentDetailsPlace.getPlaceOpenTime() == null) {
            detailsPlaceOpenTime.setVisibility(View.GONE);
            moreInfoTitle.setVisibility(View.GONE);
        } else {
            detailsPlaceOpenTime.setVisibility(View.VISIBLE);
            detailsPlaceOpenTime.setText(currentDetailsPlace.getPlaceOpenTime());
            moreInfoTitle.setVisibility(View.VISIBLE);
        }

        // Set the average price to be the average price of current place
        TextView detailsPlacePrice = (TextView) listItemView.findViewById(R.id.price);
        if (currentDetailsPlace.getPlacePrice() == null) {
            detailsPlacePrice.setVisibility(View.GONE);
            detailsPlaceWebsite.setPadding(26,16,16,26);
        } else {
            detailsPlacePrice.setVisibility(View.VISIBLE);
            detailsPlacePrice.setText(currentDetailsPlace.getPlacePrice());
        }

        return listItemView;
    }
}
