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

    // address of the place
    private String mPlaceAddress;

    // telephone number of the place
    private String mPlaceTelephone;

    // website of the place
    private String mPlaceWebsite;

    // opening hours of the place
    private String mPlaceOpenTime;

    // price of entrance
    private String mPlacePrice;

    // Construct Place class
    public Place(String placeName, String placeStyle, String placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    // Construct Place class
    public Place(String placeName, int imageResourceId) {
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }

    // Construct Place class
    public Place(String placeName, String placeStyle, int placeImageResrouceId, String placeDescription, String placeAddress,
                 String placeTelephone, String placeWebsite, String placeOpenTime, String placePrice) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mImageResourceId = placeImageResrouceId;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlaceTelephone = placeTelephone;
        mPlaceWebsite = placeWebsite;
        mPlaceOpenTime = placeOpenTime;
        mPlacePrice = placePrice;

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

    // Get the address of the place
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    // Get the telephone number of the place
    public String getPlaceTelephone() {
        return mPlaceTelephone;
    }

    // Get the website of the place
    public String getPlaceWebsite() {
        return mPlaceWebsite;
    }
    // Get the opening time of the place
    public String getPlaceOpenTime() {
        return mPlaceOpenTime;
    }

    // Get the price of entrance to the place
    public String getPlacePrice() {
        return mPlacePrice;
    }
}
