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
        playPlaces.add(new

                Place("Flamingo Spa", "Spa", R.drawable.activity_flamingo_spa,
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults. If you get hungry Spa Cafe is here for you with its delicious menu. Adult Spa is full of amazing treatments so you can get a total relaxation on your day off. For the youngsters we have an indoor playpark called Naurusaari where children can play and have fun.",
                "Tasetie 8, 01510 Vantaa", "+358-207-785-201",
                "http://www.flamingospa.fi/Home",
                "10am-9pm Mon-Sat, 10am-6pm Sun",
                "price varies from 10€ to 68€ based on time and service types")

        );
        playPlaces.add(new

                Place("Restaurant Day", "Event", R.drawable.activity_restaurant_day,
                "Restaurant Day is a worldwide food carnival and a movement that allows anyone to set up a restaurant, café or a bar.",
                "Restaurant Day is a worldwide food carnival and a movement that allows anyone to set up a restaurant, café or a bar. Pop-up restaurants can be opened and local food carnivals can happen anytime and anywhere: at your home, at the office, on a street corner, in your garden or inner courtyard, at a park, or on the beach – only your imagination is the limit.",
                "Here and there", "N/A",
                "http://www.restaurantday.org/en/",
                "Next restaurant day is 20.05.2017",
                "Price varies from stand to stand")

        );
        playPlaces.add(new

                Place("Cosy Finnish Sauna Evening", "Sauna", R.drawable.activity_finnish_sauna,
                "Visit in a private home including a possibility to experience sauna.",
                "Visit in a private home including a possibility to experience sauna. During the visit the host tells about sauna habits and if you wish, you may try sauna. Light sauna-meal or sauna-coffee is served.",
                "Here and there", "N/A",
                "http://www.visitfinland.com/mystay/15917/",
                "Agree with local host",
                "Agree with local host")

        );
        playPlaces.add(new

                Place("Lux Helsinki Light Festival", "Event", R.drawable.activity_lux_light_festival,
                "Lux Helsinki will offer inspiring light artworks and a festival atmosphere at the darkest time of the year.",
                "Lux Helsinki will offer inspiring light artworks and a festival atmosphere at the darkest time of the year. The most exciting artists from Finland and all around the world will create artworks in Helsinki city centre. Lux Helsinki is suitable for the whole family and entry is free of charge. The festival will be organised by the City of Helsinki.",
                "In city center of Helsinki", "N/A",
                "http://www.luxhelsinki.fi/en/index.html",
                "The next Lux Helsinki festival will take place in 6-10 January 2018.",
                "Free entrance")

        );
        playPlaces.add(new

                Place("Cleaning day", "Event", R.drawable.activity_siivous_paiva,
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling.",
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling. The neatest festival of the year changes cities and neighborhoods into huge flea markets and marketplaces. Anyone can offer their second hand items up for sale on the streets, yards and at home, as well as make the best finds of the day.",
                "Here and there", "N/A",
                "http://siivouspaiva.com/en/cleaningday",
                "The next clearning day will take place on Saturday 27 May 2017..",
                "Free entrance")

        );
        playPlaces.add(new

                Place("Helsinki City Marathon", "Fortress", R.drawable.activity_helsinki_city_marathon,
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. ",
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. Route takes runners thrue the city and shows also the beautiful seaside of Helsinki.",
                "Helsinki city center", "+358-295-338-410",
                "http://www.suomenlinna.fi/en/",
                "12/08/2017 - 3:00pm",
                "Registration fee varies from 50 to 96 euros")

        );

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
                Intent intent = new Intent(getActivity(), DetailsActivity.class);

                // Pass a bundle which contains the place arraylist when constructing the activity
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("placesList", playPlaces);
                intent.putExtras(bundle);

                // Put the position of the clicked item as extra information when turning to another activity.
                intent.putExtra("position", position);

                startActivity(intent);
            }
        });

        return rootView;
    }

}
