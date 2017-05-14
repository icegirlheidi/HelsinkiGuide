package com.example.android.helsinkiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SleepDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content view to be the layout of list item which shows the details of the place
        //setContentView(R.layout.place_details_list_item);
        setContentView(R.layout.place_list);


        // Create and initialize the ArrayList which include the details of the place
        final ArrayList<Place> detailsSleepPlaces = new ArrayList<>();
        detailsSleepPlaces.add(new Place("Hotel Haven", "TOP CHOICE", R.drawable.hotel_haven,
                "The closest hotel to the kauppatori is elegant, welcoming and scores high on all levels. All room grades feature excellent beds and linen, soft colour combinations, classy toiletries and thoughtful extras like sockets in the safes. ‘Comfort’ rooms face the street and are very spacious; higher grades give add-ons – like a Nespresso machine in ‘Lux’ category – and some offer a magnificent harbour view.",
                "Unioninkatu 17", "+358-96-81-930",
                "https://www.hotelhaven.fi"));
        detailsSleepPlaces.add(new Place("Hotel Katajanokka", "TOP CHOICE", R.drawable.hotel_katajanokka,
                "Set in a refurbished prison, this place offers character in spades on Katajanokka island. Rooms stretch over two to three ex-cells, so they’re anything but pokey, and boast not slop buckets but sleek modern bathrooms. Penitentiary jokes – handcuffs for sale at reception – aside, there's plenty of luxury and a sumptuous sauna. Tram 4 stops right outside. This jailhouse rocks.",
                "Merikasarminkatu 1A", "+358-96-86-450",
                "www.hotelkatajanokka.fi/en/"));
        detailsSleepPlaces.add(new Place("Hotel F6", "TOP CHOICE", R.drawable.hotel_f6,
                "Stunningly designed, this hotel opened in 2016 and ranges around an internal courtyard (some rooms have direct access and patios); superior rooms come with French balconies. All 66 rooms are spacious (even the smallest are 27 sq m) and stylishly furnished with cushion-strewn sofas. The courtyard also has a herb garden supplying the bar. Breakfast is organic; wind and water powers all electricity.",
                "Fabianinkatu 6", "+358-968-999-666",
                "https://www.hotelf6.fi"));
        detailsSleepPlaces.add(new Place("Hostel Diana Park", "HOSTEL", R.drawable.hotel_hostel_diana,
                "More like a guesthouse, Helsinki’s most characterful and laid-back hostel occupies the top floor of a building in a lively street of bars and restaurants. Its 50 beds are spread across 15 rooms; all share bathrooms but have in-room sinks. Private rooms offer more peace and there's a great lounge for socialising. HI members get 10% off; breakfast costs €7.",
                "Uudenmaankatu 9", "+358-96-42-169",
                "www.dianapark.fi/"));
        detailsSleepPlaces.add(new Place("GLO Hotel Kluuvi", "HOTEL IN CITY CENTRE", R.drawable.hotel_glo_kluuvi,
                "There are no starched suits at reception at this laidback designer joint, and the relaxed atmosphere continues through the comfortably modish public areas to the rooms. Beds: exceptionally inviting. Facilities: top notch and mostly free. Location: on a pedestrian street in the heart of town. Cute extra: a stuffed tiger toy atop the covers.",
                "Kluuvikatu 4", "0103 444400",
                "www.glohotels.fi/en/hotels/glo-kluuvi"));
        detailsSleepPlaces.add(new Place("Hellsten Helsinki Parliament", "APARTMENT", R.drawable.hotel_hellsten,
                "A step up in style and comfort from many hotels, the apartments here have sleek modern furnishings, kitchenette, internet connections and cable TV. Prices vary seasonally and there are discounts for longer stays. It’s in a great location. You will receive a keycode if you arrive outside hours.",
                "Museokatu 18", "+358-92-511-050",
                "http://hellstenhotels.fi/Hellsten_Hotel_Apartments"));

        Bundle extras = getIntent().getExtras();
        int position = extras.getInt("position");

        Place currentDetailsPlace = detailsSleepPlaces.get(position);

        final ArrayList<Place> currentPlace = new ArrayList<>();
        currentPlace.add(currentDetailsPlace);

        DetailsAdapter detailsAdapter = new DetailsAdapter(this, currentPlace);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(detailsAdapter);

    }

}
