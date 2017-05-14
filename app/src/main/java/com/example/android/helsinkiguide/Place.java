package com.example.android.helsinkiguide;

import android.os.Parcel;
import android.os.Parcelable;

public final class Place implements Parcelable {

    // the name of this place
    private String mPlaceName;

    // the style of this place
    private String mPlaceStyle;

    private String mPlaceSimpleDescription;

    // a short description about this place
    private String mPlaceDescription;

    // image resource id of this place
    private int mImageResourceId;

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
    public Place(String placeName, String placeStyle, int placeImageResrouceId, String placeSimpleDescription, String placeDescription, String placeAddress,
                 String placeTelephone, String placeWebsite, String placeOpenTime, String placePrice) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mImageResourceId = placeImageResrouceId;
        mPlaceSimpleDescription = placeSimpleDescription;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlaceTelephone = placeTelephone;
        mPlaceWebsite = placeWebsite;
        mPlaceOpenTime = placeOpenTime;
        mPlacePrice = placePrice;

    }

    // Construct Place class
    public Place(String placeName, String placeStyle, int placeImageResrouceId, String placeSimpleDescription, String placeDescription, String placeAddress,
                 String placeTelephone, String placeWebsite) {
        mPlaceName = placeName;
        mPlaceStyle = placeStyle;
        mImageResourceId = placeImageResrouceId;
        mPlaceSimpleDescription = placeSimpleDescription;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlaceTelephone = placeTelephone;
        mPlaceWebsite = placeWebsite;
    }

    protected Place(Parcel in) {
        mPlaceName = in.readString();
        mPlaceStyle = in.readString();
        mPlaceSimpleDescription = in.readString();
        mPlaceDescription = in.readString();
        mImageResourceId = in.readInt();
        mPlaceAddress = in.readString();
        mPlaceTelephone = in.readString();
        mPlaceWebsite = in.readString();
        mPlaceOpenTime = in.readString();
        mPlacePrice = in.readString();
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    // Get the name of the place
    public String getPlaceName() {
        return mPlaceName;
    }

    // Get the style of the place
    public String getPlaceStyle() {
        return mPlaceStyle;
    }

    // Get a simple description about the place
    public String getPlaceSimpleDescription() {
        return mPlaceSimpleDescription;
    }

    // Get a detailed description about the place
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    // Get the image resource Id of the place
    public int getImageResourceId() {
        return mImageResourceId;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mPlaceName);
        parcel.writeString(mPlaceStyle);
        parcel.writeString(mPlaceSimpleDescription);
        parcel.writeString(mPlaceDescription);
        parcel.writeInt(mImageResourceId);
        parcel.writeString(mPlaceAddress);
        parcel.writeString(mPlaceTelephone);
        parcel.writeString(mPlaceWebsite);
        parcel.writeString(mPlaceOpenTime);
        parcel.writeString(mPlacePrice);
    }
}
