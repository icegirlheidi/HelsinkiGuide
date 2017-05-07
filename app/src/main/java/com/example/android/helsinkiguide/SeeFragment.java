package com.example.android.helsinkiguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        seePlaces.add(new Place("Tuomiokirkko", R.drawable.sight_tuomiokirkko));
        seePlaces.add(new Place("Temppeliaukio", R.drawable.sight_temppeliaukio));
        seePlaces.add(new Place("Kamppi Chapel", R.drawable.sight_kamppi_chapel));
        seePlaces.add(new Place("Kiasma", R.drawable.sight_kiasma));
        seePlaces.add(new Place("Seurasaari", R.drawable.sight_seurasaari));
        seePlaces.add(new Place("Kansallismuseum", R.drawable.sight_kansallismuseo));
        seePlaces.add(new Place("Suomenlinna", R.drawable.sight_suomenlinnna));

        SeePlaceAdapter adapter = new SeePlaceAdapter(getContext(), seePlaces);

        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the clicked list item at current position
                Place sleepPlace = seePlaces.get(position);

                // Turn to the page showing details of this place after certain item is clicked
                Intent detailsIntent = new Intent(getActivity(), SeeDetailsActivity.class);

                // Put the position of the clicked item as extra information when turning to another activity.
                detailsIntent.putExtra("position", position);

                startActivity(detailsIntent);
            }
        });

        return rootView;
    }
}

