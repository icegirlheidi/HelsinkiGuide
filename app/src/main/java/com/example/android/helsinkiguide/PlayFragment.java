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
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create and initialize an arraylist of places for playing
        ArrayList<Place> playPlaces = new ArrayList<>();
        playPlaces.add(new Place("Flamingo Spa", "Spa",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Restaurant Day", "Event",
                "On a Restaurant Day anyone can set up a restaurant, anywhere in Finland.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Cosy Finnish Sauna Evening", "Sauna",
                "Visit a Finnish home and experience an authentic sauna, if you dare.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Flamingo Spa", "Spa",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Restaurant Day", "Event",
                "On a Restaurant Day anyone can set up a restaurant, anywhere in Finland.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Cosy Finnish Sauna Evening", "Sauna",
                "Visit a Finnish home and experience an authentic sauna, if you dare.",
                R.drawable.place_pic));

        // Create placeAdapter and set it with place_list
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), playPlaces);
        listView.setAdapter(placeAdapter);


        return rootView;
    }

}
