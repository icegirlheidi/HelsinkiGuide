package com.example.android.helsinkiguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create and initialize array of places for sleeping
        ArrayList<Place> sleepPlaces = new ArrayList<>();
        sleepPlaces.add(new Place("Hotel Haven", "TOP CHOICE",
                "The closest hotel to the kauppatori is elegant, welcoming and scores high on all levels.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hotel Katajanokka", "TOP CHOICE",
                "Set in a refurbished prison, this place offers character in spades on Katajanokka island.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hotel F6", "TOP CHOICE",
                "Stunningly designed, this hotel opened in 2016 and ranges around an internal courtyard",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hostel Diana Park", "HOSTEL",
                "Helsinki’s most characterful and laid-back hostel occupies the top floor of a building in a lively street ",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("GLO Hotel Kluuvi", "HOTEL IN CITY CENTRE",
                "The relaxed atmosphere continues through the comfortably modish public areas to the rooms.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hellsten Helsinki Parliament", "APARTMENT",
                "the apartments here have sleek modern furnishings, kitchenette, internet connections and cable TV.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hotel Haven", "TOP CHOICE",
                "The closest hotel to the kauppatori is elegant, welcoming and scores high on all levels.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hotel Katajanokka", "TOP CHOICE",
                "Set in a refurbished prison, this place offers character in spades on Katajanokka island.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hotel F6", "TOP CHOICE",
                "Stunningly designed, this hotel opened in 2016 and ranges around an internal courtyard",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hostel Diana Park", "HOSTEL",
                "Helsinki’s most characterful and laid-back hostel occupies the top floor of a building in a lively street ",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("GLO Hotel Kluuvi", "HOTEL IN CITY CENTRE",
                "The relaxed atmosphere continues through the comfortably modish public areas to the rooms.",
                R.drawable.place_pic));
        sleepPlaces.add(new Place("Hellsten Helsinki Parliament", "APARTMENT",
                "the apartments here have sleek modern furnishings, kitchenette, internet connections and cable TV.",
                R.drawable.place_pic));

        // Create placeAdapter and set it with place_list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), sleepPlaces);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
