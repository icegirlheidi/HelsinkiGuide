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
        final ArrayList<Place> playPlaces = new ArrayList<>();
        playPlaces.add(new Place("Flamingo Spa", "Spa",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Restaurant Day", "Event",
                "On a Restaurant Day anyone can set up a restaurant, anywhere in Finland.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Cosy Finnish Sauna Evening", "Sauna",
                "Visit a Finnish home and experience an authentic sauna, if you dare.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Lux Helsinki Light Festival", "Event",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Cleaning day", "Event",
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling. The neatest festival of the year changes cities and neighborhoods into huge flea markets and marketplaces. Anyone can offer their second hand items up for sale on the streets, yards and at home, as well as make the best finds of the day.",
                R.drawable.place_pic));
        playPlaces.add(new Place("Helsinki City Marathon", "Event",
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. Route takes runners thrue the city and shows also the beautiful seaside of Helsinki.",
                R.drawable.place_pic));

        // Create placeAdapter and set it with place_list
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), playPlaces);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the clicked list item at current position
                Place sleepPlace = playPlaces.get(position);

                // Turn to the page showing details of this place after certain item is clicked
                Intent detailsIntent = new Intent(getActivity(), PlayDetailsActivity.class);

                // Put the position of the clicked item as extra information when turning to another activity.
                detailsIntent.putExtra("position", position);

                startActivity(detailsIntent);
            }
        });

        return rootView;
    }

}
