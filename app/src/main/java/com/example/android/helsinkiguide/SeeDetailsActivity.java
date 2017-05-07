package com.example.android.helsinkiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SeeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content view to be the layout of list item which shows the details of the place
        setContentView(R.layout.place_details_list_item);


        // Create and initialize the ArrayList which include the details of the place
        final ArrayList<Place> detailsSeePlaces = new ArrayList<>();
        detailsSeePlaces.add(new

                Place("Tuomiokirkko", "Church", R.drawable.sight_tuomiokirkko,
                "The Cathedral rising on the northern side of the Senate Square is the stage of national and academic festive services and one of the most popular tourist sights. The church is part of Helsinki\"s Empire era centre and a landmark for those arriving by sea.",
                "Unioninkatu 29, 00170 Helsinki", "+358-923-406-120",
                "http://www.helsinginkirkot.fi/en/churches/cathedral",
                "every day 9 am–6 pm, June–August 9 am–0.00 am",
                "Free entrance")

        );
        detailsSeePlaces.add(new

                Place("Temppeliaukio", "Church", R.drawable.sight_temppeliaukio,
                "Excavated directly into solid rock, the Temppeliaukio church is situated in the heart of Helsinki, at the end of Fredrikinkatu. Because of its special architecture, the church, completed in 1969, is one of the main attractions in Helsinki. The church hall is covered with a dome, lined with copper and supported on the rock walls by reinforced concrete beams. The interior walls are of rugged rock and rubble wall. Before noon, the sunlight spreads from the row of windows surrounding the roof periphery to the altar wall, where an ice-age crevice serves as the altarpiece.",
                "Lutherinkatu 3, 00100 Helsinki", "+358-923-406-320",
                "http://www.helsinginkirkot.fi/en/churches/rock-church-temppeliaukio",
                "according to activities",
                "Free entrance")

        );
        detailsSeePlaces.add(new

                Place("Kamppi Chapel", "Church", R.drawable.sight_kamppi_chapel,
                "The Chapel was designed by architects Kimmo Lintula, Niko Sirola and Mikko Summanen of K2S Architects Ltd. The Chapel is a sample of innovative wood architecture, and it received a lot of attention even before it was completed. For example, it was granted the International Architecture Award 2010 by The Chicago Athenaeum. The Kamppi Chapel was part of the World Design Capital Helsinki 2012 program.",
                "Simonkatu 7, 00100 Helsinki", "+358-923-402-018",
                "http://www.helsinginkirkot.fi/en/churches/kamppi-chapel-of-silence",
                "Monday to Friday 8am–8pm, Saturdays and Sundays 10am–6pm",
                "Free entrance")

        );
        detailsSeePlaces.add(new

                Place("Kiasma", "Art Museum", R.drawable.sight_kiasma,
                "Now one of a series of elegant contemporary buildings in this part of town, curvaceous and quirky metallic Kiasma, designed by Steven Holl and finished in 1998, is a symbol of the city’s modernisation. It exhibits an eclectic collection of Finnish and international modern art, along with its striking contemporary exhibitions. Kiasma’s outstanding success is that it’s been embraced by the people of Helsinki. Its sleek, glass-sided cafe and terrace are hugely popular.",
                "Mannerheiminaukio 2, 00100 Helsinki", "N/A",
                "http://www.kiasma.fi/en/",
                "10am-5pm Tue & Sun, to 8.30pm Wed-Fri, to 6pm Sat",
                "adult/child €12/free, 1st Fri of month free")

        );
        detailsSeePlaces.add(new

                Place("Seurasaari", "Open Air Museum", R.drawable.sight_seurasaari,
                "Situated 5.5km northwest of the city centre, this excellent island-set museum has a collection of historic wooden buildings transferred here from around Finland. There's everything from haylofts to a mansion, parsonage and church, as well as the beautiful giant rowboats used to transport churchgoing communities. Prices and hours refer to entering the museum's buildings, where guides in traditional costume demonstrate folk dancing and crafts. Otherwise, you're free to roam the picturesque wooded island, where there are several cafes.",
                "Seurasaari, Helsinki", "+358-295-336-912",
                "http://www.kansallismuseo.fi/en/seurasaari-openairmuseum",
                "11am-5pm Jun-Aug, 9am-3pm Mon-Fri, 11am-5pm Sat & Sun late May & early Sep",
                "adult/child €9/3")

        );
        detailsSeePlaces.add(new

                Place("Kansallismuseo", "Museum", R.drawable.sight_kansallismuseo,
                "The impressive National Museum, built in National Romantic style in 1916, looks a bit like a Gothic church with its heavy stonework and tall square tower. This is Finland’s premier historical museum and is divided into rooms covering different periods of Finnish history, including prehistory and archaeological finds, church relics, ethnography and changing cultural exhibitions. It’s a very thorough, old-style museum – you might have trouble selling this one to the kids – but provides a comprehensive overview.",
                "Mannerheimintie 34, 00100 Helsinki", "+358-443-350-457",
                "http://www.helsinkicitymarathon.fi/en",
                "11am-6pm Tue-Sun",
                "adult/child €10/free, 4-6pm Fri free")

        );

        // Get the position of item clicked from EatFragment
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        // Get the corresponding place based on the item clicked in SleepFragment
        Place currentPlace = detailsSeePlaces.get(position);

        // Set the place name to be name of current place
        TextView placeNameTextView = (TextView) findViewById(R.id.details_place_name);
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Set the style to be the style of current place
        TextView placeStyleTextView = (TextView) findViewById(R.id.details_place_style);
        placeStyleTextView.setText(currentPlace.getPlaceStyle());

        // Set the image resource Id to be the image resource Id of current place
        ImageView placeImageView = (ImageView) findViewById(R.id.details_image);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        // Set the description to be the description of current place
        TextView detailsPlaceDescription = (TextView) findViewById(R.id.details_place_description);
        detailsPlaceDescription.setText(currentPlace.getPlaceDescription());

        // Set the address to be the address of current place
        TextView detailsPlaceAddress = (TextView) findViewById(R.id.address);
        detailsPlaceAddress.setText(currentPlace.getPlaceAddress());

        // Set the telephone number to be the telephone number of current place
        TextView detailsPlaceTelephone = (TextView) findViewById(R.id.telephone);
        detailsPlaceTelephone.setText(currentPlace.getPlaceTelephone());

        // Set the website to be the website of current place
        TextView detailsPlaceWebsite = (TextView) findViewById(R.id.website);
        detailsPlaceWebsite.setText(currentPlace.getPlaceWebsite());

        // Set More Info visible
        // Set More Information container invisible
        LinearLayout moreInfoContainer = (LinearLayout)findViewById(R.id.more_info_container);
        moreInfoContainer.setVisibility(View.VISIBLE);

        // Set the opening time to be the opening time of current place
        TextView detailsPlaceOpenTime = (TextView) findViewById(R.id.open_time);
        detailsPlaceOpenTime.setText(currentPlace.getPlaceOpenTime());

        // Set the average price to be the average price of current place
        TextView detailsPlacePrice = (TextView) findViewById(R.id.price);
        detailsPlacePrice.setText(currentPlace.getPlacePrice());

    }
}
