package com.example.android.helsinkiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EatDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> detailsPlaces = new ArrayList<>();
        detailsPlaces.add(new Place("Olo", "Michelin-starred", R.drawable.restaurant_olo,
                "Considered Helsinki's best restaurant, Michelin-starred Olo occupies a handsome 19th-century harbourside mansion. It's at the forefront of modern Suomi cuisine, and its memorable dégustation menus incorporate both the forage ethos and molecular gastronomy, and feature culinary jewels such as herring with fermented cucumber, Åland lamb with blackcurrant leaves, juniper-marinated reindeer carpaccio, and Arctic crab with root celery. Book a few weeks ahead.",
                "Pohjoisesplanadi 5", "+358-10-320-6250", "http://olo-ravintola.fi", "11.30am-3pm & 6pm-midnight Tue-Fri, 6pm-midnight Sat",
                "4-course lunch menu €52, dinner tasting menus €73-149, with paired wines €153-315"));
        detailsPlaces.add(new Place("Kuu", "Top Choice", R.drawable.restaurant_kuu,
                "Traditional Finnish fare is given a sharp, contemporary twist at Kuu, which creates dishes from local ingredients such as smoked reindeer heart with pickled forest mushrooms, poached pike-perch with Lappish fingerling potatoes, and liquorice ice cream with cloudberry soup. Wines are pricey, but there are some interesting choices. Its casual bistro sibling KuuKuu is located 800m south.",
                "Töölönkatu 27", "+358-92-709-0973", "http://www.ravintolakuu.fi",
                "11.30am-midnight Mon-Fri, 2pm-midnight Sat, 2-10pm Sun",
                "mains €19-30, 2-/3-course lunch menus €24/28, 4-course dinner menus €48-51"));
        detailsPlaces.add(new Place("Karl Fazer Cafe", "Cafe", R.drawable.restaurant_karl_fazer_cafe,
                "Founded in 1891 and fronted by a striking art-deco facade, this cavernous classic cafe is the flagship for Fazer's chocolate empire. The glass cupola reflects sound, so locals say it’s a bad place to gossip. It's ideal, however, for buying dazzling confectionery, fresh bread, salmon or shrimp sandwiches, or digging into towering sundaes or spectacular cakes. Gluten-free dishes are available.",
                "Kluuvikatu 3", "+358-20-729-6702", "http://www.fazer.fi",
                "7.30am-10pm Mon-Fri, 9am-10pm Sat, 10am-6pm Sun",
                "dishes €3.90-12"));
        detailsPlaces.add(new Place("Zucchini", "Vegetarian", R.drawable.restaurant_zucchini,
                "One of the city’s original and most popular vegetarian cafes, Zucchini is a top-notch lunch spot; queues out the door aren't unusual. Steaming soups banish winter chills, while freshly baked quiche on the sunny terrace is a summer treat. Year-round, you can choose soup or salad/hot dish or both. At least one vegan dish features on the daily changing menu.",
                "Fabianinkatu 4", "+358-96-222-907", "http://www.zucchini.fi",
                "11am-4pm Mon-Fri", "lunch mains €8-12"));
        detailsPlaces.add(new Place("Kosmos", "Finnish", R.drawable.restaurant_kosmos,
                "Designed by Alvar Aalto, and with a bohemian history, this nonagenarian place is a Helsinki classic. It combines a staid, very traditionally Finnish atmosphere with tasty not-very-modern dishes, including reindeer, sweetbreads, kidneys and succulent fish options. Service can be no-nonsense but comes straight from the days when waiting tables was a career.",
                "Kalevankatu 3", " 0+358-96-472-55", "http://www.kosmos.fi",
                "11.30am-1am Mon-Fri, 4pm-1am Sa",
                "mains €20-34"));
        detailsPlaces.add(new Place("Juuri", "Finnish", R.drawable.restaurant_juuri,
                "Creative takes on classic Finnish ingredients draw the crowds to this stylish modern restaurant, but the best way to eat is to sample the ‘sapas’, which are tapas with a Suomi twist (€4.70 per plate). You might graze on marinated fish, smoked beef or homemade sausages. There are good lunches too, but they’re not as interesting.",
                "Korkeavuorenkatu 27", "+358-96-357-32", "ttp://www.juuri.fi",
                "1am-2.30pm & 4-10pm Mon-Fri, 4-10pm Sat & Sun",
                "mains €28-30"));

        DetailsAdapter detailsAdapter = new DetailsAdapter(this, detailsPlaces);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(detailsAdapter);

    }
}
