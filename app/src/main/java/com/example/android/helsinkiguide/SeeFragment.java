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
public class SeeFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    public SeeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> seePlaces = new ArrayList<>();
        seePlaces.add(new Place("Tuomiokirkko", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Temppeliaukio", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Kamppi Chapel", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Kiasma", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Seurasaari", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Sibelius Monument", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Seurasaari", R.drawable.tuomiokirkko));
        seePlaces.add(new Place("Suomenlinna", R.drawable.tuomiokirkko));

        SeePlaceAdapter adapter = new SeePlaceAdapter(getContext(), seePlaces);

        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

