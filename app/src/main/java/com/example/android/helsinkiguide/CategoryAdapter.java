package com.example.android.helsinkiguide;

import android.content.Context;
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
        if (position == 0){
            return new SeeFragment();
        } else if (position == 1){
            return new EatFragment();
        } else if ( position == 2){
            return new SleepFragment();
        } else {
            return new PlayFragment();
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
}
