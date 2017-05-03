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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Olo", "Michelin-starred",
                "Considered Helsinki's best restaurant, Michelin starred Olo occupies a handsome 19th-century harbourside mansion.",
                R.drawable.place_pic));
        places.add(new Place("Kuu", "Top Choice",
                "Traditional Finnish fare is given a sharp, contemporary twist at Kuu, which creates dishes from local ingredients",
                R.drawable.place_pic));
        places.add(new Place("Karl Fazer Cafe", "Cafe",
                "Founded in 1891 and fronted by a striking art-deco facade, this cavernous classic cafe is the flagship for Fazer's chocolate empire.",
                R.drawable.place_pic));
        places.add(new Place("Zucchini", "Vegetarian",
                "One of the city’s original and most popular vegetarian cafes, Zucchini is a top-notch lunch spot.",
                R.drawable.place_pic));
        places.add(new Place("Kosmos", "Finnish",
                "Designed by Alvar Aalto, and with a bohemian history, this nonagenarian place is a Helsinki classic.",
                R.drawable.place_pic));
        places.add(new Place("Juuri", "Finnish",
                "Creative takes on classic Finnish ingredients draw the crowds to this stylish modern restaurant.",
                R.drawable.place_pic));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
