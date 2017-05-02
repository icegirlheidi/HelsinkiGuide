package com.example.android.helsinkiguide;

/**
 * Created by icegirlheidi on 17/5/2.
 */

public class Place {

    // the name of this place
    private String mPlaceName;

    // the style of this place
    private String mPlaceStyle;

    // a short description about this place
    private String mPlaceDescription;

    // image resource id of this place
    private int mImageResourceId;

    // Construct Place class
    public Place(String placeName, String placeStyle, String placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    // Get the name of the place
    public String getmPlaceName() {
        return mPlaceName;
    }

    // Get the style of the place
    public String getmPlaceStyle() {
        return mPlaceStyle;
    }

    // Get a simple description about the place
    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    // Get the image resource Id of the place
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
