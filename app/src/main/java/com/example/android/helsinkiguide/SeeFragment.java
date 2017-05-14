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
        seePlaces.add(new

                Place("Tuomiokirkko", "Church", R.drawable.sight_tuomiokirkko,
                "The Cathedral rising on the northern side of the Senate Square is the stage of national and academic festive services and one of the most popular tourist sights.",
                "The Cathedral rising on the northern side of the Senate Square is the stage of national and academic festive services and one of the most popular tourist sights. The church is part of Helsinki\"s Empire era centre and a landmark for those arriving by sea.",
                "Unioninkatu 29, 00170 Helsinki", "+358-923-406-120",
                "http://www.helsinginkirkot.fi/en/churches/cathedral",
                "every day 9 am–6 pm, June–August 9 am–0.00 am",
                "Free entrance")

        );
        seePlaces.add(new

                Place("Temppeliaukio", "Church", R.drawable.sight_temppeliaukio,
                "Excavated directly into solid rock, the Temppeliaukio church is situated in the heart of Helsinki, at the end of Fredrikinkatu.",
                "Excavated directly into solid rock, the Temppeliaukio church is situated in the heart of Helsinki, at the end of Fredrikinkatu. Because of its special architecture, the church, completed in 1969, is one of the main attractions in Helsinki. The church hall is covered with a dome, lined with copper and supported on the rock walls by reinforced concrete beams. The interior walls are of rugged rock and rubble wall. Before noon, the sunlight spreads from the row of windows surrounding the roof periphery to the altar wall, where an ice-age crevice serves as the altarpiece.",
                "Lutherinkatu 3, 00100 Helsinki", "+358-923-406-320",
                "http://www.helsinginkirkot.fi/en/churches/rock-church-temppeliaukio",
                "according to activities",
                "Free entrance")

        );
        seePlaces.add(new

                Place("Kamppi Chapel", "Church", R.drawable.sight_kamppi_chapel,
                "The Chapel was designed by architects Kimmo Lintula, Niko Sirola and Mikko Summanen of K2S Architects Ltd.",
                "The Chapel was designed by architects Kimmo Lintula, Niko Sirola and Mikko Summanen of K2S Architects Ltd. The Chapel is a sample of innovative wood architecture, and it received a lot of attention even before it was completed. For example, it was granted the International Architecture Award 2010 by The Chicago Athenaeum. The Kamppi Chapel was part of the World Design Capital Helsinki 2012 program.",
                "Simonkatu 7, 00100 Helsinki", "+358-923-402-018",
                "http://www.helsinginkirkot.fi/en/churches/kamppi-chapel-of-silence",
                "Monday to Friday 8am–8pm, Saturdays and Sundays 10am–6pm",
                "Free entrance")

        );
        seePlaces.add(new

                Place("Kiasma", "Art Museum", R.drawable.sight_kiasma,
                "Now one of a series of elegant contemporary buildings in this part of town, curvaceous and quirky metallic Kiasma, designed by Steven Holl and finished in 1998, is a symbol of the city’s modernisation.",
                "Now one of a series of elegant contemporary buildings in this part of town, curvaceous and quirky metallic Kiasma, designed by Steven Holl and finished in 1998, is a symbol of the city’s modernisation. It exhibits an eclectic collection of Finnish and international modern art, along with its striking contemporary exhibitions. Kiasma’s outstanding success is that it’s been embraced by the people of Helsinki. Its sleek, glass-sided cafe and terrace are hugely popular.",
                "Mannerheiminaukio 2, 00100 Helsinki", "N/A",
                "http://www.kiasma.fi/en/",
                "10am-5pm Tue & Sun, to 8.30pm Wed-Fri, to 6pm Sat",
                "adult/child €12/free, 1st Fri of month free")

        );
        seePlaces.add(new

                Place("Seurasaari", "Open Air Museum", R.drawable.sight_seurasaari,
                "Situated 5.5km northwest of the city centre, this excellent island-set museum has a collection of historic wooden buildings transferred here from around Finland.",
                "Situated 5.5km northwest of the city centre, this excellent island-set museum has a collection of historic wooden buildings transferred here from around Finland. There's everything from haylofts to a mansion, parsonage and church, as well as the beautiful giant rowboats used to transport churchgoing communities. Prices and hours refer to entering the museum's buildings, where guides in traditional costume demonstrate folk dancing and crafts. Otherwise, you're free to roam the picturesque wooded island, where there are several cafes.",
                "Seurasaari, Helsinki", "+358-295-336-912",
                "http://www.kansallismuseo.fi/en/seurasaari-openairmuseum",
                "11am-5pm Jun-Aug, 9am-3pm Mon-Fri, 11am-5pm Sat & Sun late May & early Sep",
                "adult/child €9/3")

        );
        seePlaces.add(new

                Place("Kansallismuseo", "Museum", R.drawable.sight_kansallismuseo,
                "The impressive National Museum, built in National Romantic style in 1916, looks a bit like a Gothic church with its heavy stonework and tall square tower.",
                "The impressive National Museum, built in National Romantic style in 1916, looks a bit like a Gothic church with its heavy stonework and tall square tower. This is Finland’s premier historical museum and is divided into rooms covering different periods of Finnish history, including prehistory and archaeological finds, church relics, ethnography and changing cultural exhibitions. It’s a very thorough, old-style museum – you might have trouble selling this one to the kids – but provides a comprehensive overview.",
                "Mannerheimintie 34, 00100 Helsinki", "+358-443-350-457",
                "http://www.helsinkicitymarathon.fi/en",
                "11am-6pm Tue-Sun",
                "adult/child €10/free, 4-6pm Fri free")

        );
        seePlaces.add(new

                Place("Suomenlinna", "Fortress", R.drawable.sight_suomenlinnna,
                "Suomenlinna, the ‘fortress of Finland’, is set on a cluster of islands connected by bridges.",
                "Suomenlinna, the ‘fortress of Finland’, is set on a cluster of islands connected by bridges. The UNESCO World Heritage site was originally built by the Swedes as Sveaborg in the mid-18th century. Several museums, former bunkers and fortress walls, as well as Finland's only remaining WWII submarine, are fascinating to explore; its tourist office has info. Cafes and picnic spots are plentiful.",
                "Suomenlinna, Helsinki", "+358-295-338-410",
                "http://www.suomenlinna.fi/en/",
                "12/08/2017 - 3:00pm",
                "Ferry one way/return €4.50/7")

        );

        SeePlaceAdapter adapter = new SeePlaceAdapter(getContext(), seePlaces);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Set to have no divider
        listView.setDivider(null);
        listView.setDividerHeight(0);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the clicked list item at current position
                Place sleepPlace = seePlaces.get(position);

                // Turn to the page showing details of this place after certain item is clicked
                Intent intent = new Intent(getActivity(), DetailsActivity.class);

                // Pass a bundle which contains the place arraylist when constructing the activity
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("placesList", seePlaces);
                intent.putExtras(bundle);

                // Put the position of the clicked item as extra information when turning to another activity.
                intent.putExtra("position", position);

                startActivity(intent);
            }
        });

        return rootView;
    }
}

