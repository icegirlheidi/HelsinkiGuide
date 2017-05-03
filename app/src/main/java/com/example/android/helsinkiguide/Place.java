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

    // Set initially has no image
    private static final int NO_IMAGE_PROVIDED = -1;

    // Construct Place class
    public Place(String placeName, String placeStyle, String placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    // Get the name of the place
    public String getPlaceName() {
        return mPlaceName;
    }

    // Get the style of the place
    public String getPlaceStyle() {
        return mPlaceStyle;
    }

    // Get a simple description about the place
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    // Get the image resource Id of the place
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Check if there is image
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
