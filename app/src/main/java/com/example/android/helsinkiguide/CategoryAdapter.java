package com.example.android.helsinkiguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                PlaceFragment seeFragment = new PlaceFragment();
                setFragmentBundle(seeFragment, position);
                return seeFragment;
            case 1:
                PlaceFragment eatFragment = new PlaceFragment();
                setFragmentBundle(eatFragment, position);
                return eatFragment;
            case 2:
                PlaceFragment sleepFragment = new PlaceFragment();
                setFragmentBundle(sleepFragment, position);
                return sleepFragment;
            case 3:
                PlaceFragment playFragment = new PlaceFragment();
                setFragmentBundle(playFragment, position);
                return playFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // get the page title of each tab
        switch (position) {
            case 0:
                return mContext.getString(R.string.see).toUpperCase();
            case 1:
                return mContext.getString(R.string.eat).toUpperCase();
            case 2:
                return mContext.getString(R.string.sleep).toUpperCase();
            case 3:
                return mContext.getString(R.string.play).toUpperCase();
        }
        return null;
    }


    /** Set the bundle for fragment
     *
     * @param placeFragment is the fragment used to show a list of places
     * @param position is the position of fragment
     */
    private void setFragmentBundle(PlaceFragment placeFragment, int position) {
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                bundle.putParcelableArrayList("placesList", StaticList.getSeePlaces());
                bundle.putString("title", "See");
                break;
            case 1:
                bundle.putParcelableArrayList("placesList", StaticList.getEatPlaces());
                bundle.putString("title", "Eat");
                break;
            case 2:
                bundle.putParcelableArrayList("placesList", StaticList.getSleepPlaces());
                bundle.putString("title", "Sleep");
                break;
            case 3:
                bundle.putParcelableArrayList("placesList", StaticList.getPlayPlaces());
                bundle.putString("title", "Play");
                break;
        }
        // Set bundle with fragment
        placeFragment.setArguments(bundle);
    }
}
