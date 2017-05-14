package com.example.android.helsinkiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content view to be the layout of list item which shows the details of the place
        //setContentView(R.layout.place_details_list_item);
        setContentView(R.layout.place_list);


        // Create and initialize the ArrayList which include the details of the place
        final ArrayList<Place> detailsPlayPlaces = new ArrayList<>();
        detailsPlayPlaces.add(new

                Place("Flamingo Spa", "Spa", R.drawable.activity_flamingo_spa,
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults. If you get hungry Spa Cafe is here for you with its delicious menu. Adult Spa is full of amazing treatments so you can get a total relaxation on your day off. For the youngsters we have an indoor playpark called Naurusaari where children can play and have fun.",
                "Tasetie 8, 01510 Vantaa", "+358-207-785-201",
                "http://www.flamingospa.fi/Home",
                "10am-9pm Mon-Sat, 10am-6pm Sun",
                "price varies from 10€ to 68€ based on time and service types")

        );
        detailsPlayPlaces.add(new

                Place("Restaurant Day", "Event", R.drawable.activity_restaurant_day,
                "Restaurant Day is a worldwide food carnival and a movement that allows anyone to set up a restaurant, café or a bar. Pop-up restaurants can be opened and local food carnivals can happen anytime and anywhere: at your home, at the office, on a street corner, in your garden or inner courtyard, at a park, or on the beach – only your imagination is the limit.",
                "Here and there", "N/A",
                "http://www.restaurantday.org/en/",
                "Next restaurant day is 20.05.2017",
                "Price varies from stand to stand")

        );
        detailsPlayPlaces.add(new

                Place("Cosy Finnish Sauna Evening", "Sauna", R.drawable.activity_finnish_sauna,
                "Visit in a private home including a possibility to experience sauna. During the visit the host tells about sauna habits and if you wish, you may try sauna. Light sauna-meal or sauna-coffee is served.",
                "Here and there", "N/A",
                "http://www.visitfinland.com/mystay/15917/",
                "Agree with local host",
                "Agree with local host")

        );
        detailsPlayPlaces.add(new

                Place("Lux Helsinki Light Festival", "Event", R.drawable.activity_lux_light_festival,
                "Lux Helsinki will offer inspiring light artworks and a festival atmosphere at the darkest time of the year. The most exciting artists from Finland and all around the world will create artworks in Helsinki city centre. Lux Helsinki is suitable for the whole family and entry is free of charge. The festival will be organised by the City of Helsinki.",
                "In city center of Helsinki", "N/A",
                "http://www.luxhelsinki.fi/en/index.html",
                "The next Lux Helsinki festival will take place in 6-10 January 2018.",
                "Free entrance")

        );
        detailsPlayPlaces.add(new

                Place("Cleaning day", "Event", R.drawable.activity_siivous_paiva,
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling. The neatest festival of the year changes cities and neighborhoods into huge flea markets and marketplaces. Anyone can offer their second hand items up for sale on the streets, yards and at home, as well as make the best finds of the day.",
                "Here and there", "N/A",
                "http://siivouspaiva.com/en/cleaningday",
                "The next clearning day will take place on Saturday 27 May 2017..",
                "Free entrance")

        );
        detailsPlayPlaces.add(new

                Place("Helsinki City Marathon", "Fortress", R.drawable.activity_helsinki_city_marathon,
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. Route takes runners thrue the city and shows also the beautiful seaside of Helsinki.",
                "Helsinki city center", "+358-295-338-410",
                "http://www.suomenlinna.fi/en/",
                "12/08/2017 - 3:00pm",
                "Registration fee varies from 50 to 96 euros")

        );

        // Get the position of item clicked from EatFragment
        Bundle extras = getIntent().getExtras();
        int position = extras.getInt("position");

        Place currentDetailsPlace = detailsPlayPlaces.get(position);

        final ArrayList<Place> currentPlace = new ArrayList<>();
        currentPlace.add(currentDetailsPlace);

        DetailsAdapter detailsAdapter = new DetailsAdapter(this, currentPlace);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(detailsAdapter);


    }
}
