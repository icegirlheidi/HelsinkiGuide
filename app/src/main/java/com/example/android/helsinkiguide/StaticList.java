package com.example.android.helsinkiguide;

import java.util.ArrayList;

/**
 * Created by Omniata on 7/1/17.
 */

public class StaticList {

    static public ArrayList<Place> getSeePlaces() {
        ArrayList<Place> seePlaces = new ArrayList<>();
        seePlaces.add(new Place("Tuomiokirkko", "Church", R.drawable.sight_tuomiokirkko,
                "The Cathedral rising on the northern side of the Senate Square is the stage of national and academic festive services and one of the most popular tourist sights.",
                "The Cathedral rising on the northern side of the Senate Square is the stage of national and academic festive services and one of the most popular tourist sights. The church is part of Helsinki\"s Empire era centre and a landmark for those arriving by sea.",
                "Unioninkatu 29, 00170 Helsinki", "+358-923-406-120",
                "http://www.helsinginkirkot.fi/en/churches/cathedral",
                "every day 9 am–6 pm, June–August 9 am–0.00 am",
                "Free entrance")
        );
        seePlaces.add(new Place("Temppeliaukio", "Church", R.drawable.sight_temppeliaukio,
                "Excavated directly into solid rock, the Temppeliaukio church is situated in the heart of Helsinki, at the end of Fredrikinkatu.",
                "Excavated directly into solid rock, the Temppeliaukio church is situated in the heart of Helsinki, at the end of Fredrikinkatu. Because of its special architecture, the church, completed in 1969, is one of the main attractions in Helsinki. The church hall is covered with a dome, lined with copper and supported on the rock walls by reinforced concrete beams. The interior walls are of rugged rock and rubble wall. Before noon, the sunlight spreads from the row of windows surrounding the roof periphery to the altar wall, where an ice-age crevice serves as the altarpiece.",
                "Lutherinkatu 3, 00100 Helsinki", "+358-923-406-320",
                "http://www.helsinginkirkot.fi/en/churches/rock-church-temppeliaukio",
                "according to activities",
                "Free entrance")
        );
        seePlaces.add(new Place("Kamppi Chapel", "Church", R.drawable.sight_kamppi_chapel,
                "The Chapel was designed by architects Kimmo Lintula, Niko Sirola and Mikko Summanen of K2S Architects Ltd.",
                "The Chapel was designed by architects Kimmo Lintula, Niko Sirola and Mikko Summanen of K2S Architects Ltd. The Chapel is a sample of innovative wood architecture, and it received a lot of attention even before it was completed. For example, it was granted the International Architecture Award 2010 by The Chicago Athenaeum. The Kamppi Chapel was part of the World Design Capital Helsinki 2012 program.",
                "Simonkatu 7, 00100 Helsinki", "+358-923-402-018",
                "http://www.helsinginkirkot.fi/en/churches/kamppi-chapel-of-silence",
                "Monday to Friday 8am–8pm, Saturdays and Sundays 10am–6pm",
                "Free entrance")
        );
        seePlaces.add(new Place("Kiasma", "Art Museum", R.drawable.sight_kiasma,
                "Now one of a series of elegant contemporary buildings in this part of town, curvaceous and quirky metallic Kiasma, designed by Steven Holl and finished in 1998, is a symbol of the city’s modernisation.",
                "Now one of a series of elegant contemporary buildings in this part of town, curvaceous and quirky metallic Kiasma, designed by Steven Holl and finished in 1998, is a symbol of the city’s modernisation. It exhibits an eclectic collection of Finnish and international modern art, along with its striking contemporary exhibitions. Kiasma’s outstanding success is that it’s been embraced by the people of Helsinki. Its sleek, glass-sided cafe and terrace are hugely popular.",
                "Mannerheiminaukio 2, 00100 Helsinki", "N/A",
                "http://www.kiasma.fi/en/",
                "10am-5pm Tue & Sun, to 8.30pm Wed-Fri, to 6pm Sat",
                "adult/child €12/free, 1st Fri of month free")
        );
        seePlaces.add(new Place("Seurasaari", "Open Air Museum", R.drawable.sight_seurasaari,
                "Situated 5.5km northwest of the city centre, this excellent island-set museum has a collection of historic wooden buildings transferred here from around Finland.",
                "Situated 5.5km northwest of the city centre, this excellent island-set museum has a collection of historic wooden buildings transferred here from around Finland. There's everything from haylofts to a mansion, parsonage and church, as well as the beautiful giant rowboats used to transport churchgoing communities. Prices and hours refer to entering the museum's buildings, where guides in traditional costume demonstrate folk dancing and crafts. Otherwise, you're free to roam the picturesque wooded island, where there are several cafes.",
                "Seurasaari, Helsinki", "+358-295-336-912",
                "http://www.kansallismuseo.fi/en/seurasaari-openairmuseum",
                "11am-5pm Jun-Aug, 9am-3pm Mon-Fri, 11am-5pm Sat & Sun late May & early Sep",
                "adult/child €9/3")
        );
        seePlaces.add(new Place("Kansallismuseo", "Museum", R.drawable.sight_kansallismuseo,
                "The impressive National Museum, built in National Romantic style in 1916, looks a bit like a Gothic church with its heavy stonework and tall square tower.",
                "The impressive National Museum, built in National Romantic style in 1916, looks a bit like a Gothic church with its heavy stonework and tall square tower. This is Finland’s premier historical museum and is divided into rooms covering different periods of Finnish history, including prehistory and archaeological finds, church relics, ethnography and changing cultural exhibitions. It’s a very thorough, old-style museum – you might have trouble selling this one to the kids – but provides a comprehensive overview.",
                "Mannerheimintie 34, 00100 Helsinki", "+358-443-350-457",
                "http://www.helsinkicitymarathon.fi/en",
                "11am-6pm Tue-Sun",
                "adult/child €10/free, 4-6pm Fri free")
        );
        seePlaces.add(new Place("Suomenlinna", "Fortress", R.drawable.sight_suomenlinna,
                "Suomenlinna, the ‘fortress of Finland’, is set on a cluster of islands connected by bridges.",
                "Suomenlinna, the ‘fortress of Finland’, is set on a cluster of islands connected by bridges. The UNESCO World Heritage site was originally built by the Swedes as Sveaborg in the mid-18th century. Several museums, former bunkers and fortress walls, as well as Finland's only remaining WWII submarine, are fascinating to explore; its tourist office has info. Cafes and picnic spots are plentiful.",
                "Suomenlinna, Helsinki", "+358-295-338-410",
                "http://www.suomenlinna.fi/en/",
                "12/08/2017 - 3:00pm",
                "Ferry one way/return €4.50/7")
        );
        return seePlaces;
    }

    static public ArrayList<Place> getEatPlaces(){
        ArrayList<Place> eatPlaces = new ArrayList<>();
        eatPlaces.add(new Place("Olo", "Michelin-starred", R.drawable.restaurant_olo,
                "Considered Helsinki's best restaurant, Michelin-starred Olo occupies a handsome 19th-century harbourside mansion.",
                "Considered Helsinki's best restaurant, Michelin-starred Olo occupies a handsome 19th-century harbourside mansion. It's at the forefront of modern Suomi cuisine, and its memorable dégustation menus incorporate both the forage ethos and molecular gastronomy, and feature culinary jewels such as herring with fermented cucumber, Åland lamb with blackcurrant leaves, juniper-marinated reindeer carpaccio, and Arctic crab with root celery. Book a few weeks ahead.",
                "Pohjoisesplanadi 5", "+358-10-320-6250", "http://olo-ravintola.fi", "11.30am-3pm & 6pm-midnight Tue-Fri, 6pm-midnight Sat",
                "4-course lunch menu €52, dinner tasting menus €73-149, with paired wines €153-315"));
        eatPlaces.add(new Place("Kuu", "Top Choice", R.drawable.restaurant_kuu,
                "Traditional Finnish fare is given a sharp, contemporary twist at Kuu, which creates dishes from local ingredients.",
                "Traditional Finnish fare is given a sharp, contemporary twist at Kuu, which creates dishes from local ingredients such as smoked reindeer heart with pickled forest mushrooms, poached pike-perch with Lappish fingerling potatoes, and liquorice ice cream with cloudberry soup. Wines are pricey, but there are some interesting choices. Its casual bistro sibling KuuKuu is located 800m south.",
                "Töölönkatu 27", "+358-92-709-0973", "http://www.ravintolakuu.fi",
                "11.30am-midnight Mon-Fri, 2pm-midnight Sat, 2-10pm Sun",
                "mains €19-30, 2-/3-course lunch menus €24/28, 4-course dinner menus €48-51"));
        eatPlaces.add(new Place("Karl Fazer Cafe", "Cafe", R.drawable.restaurant_karl_fazer_cafe,
                "Founded in 1891 and fronted by a striking art-deco facade, this cavernous classic cafe is the flagship for Fazer's chocolate empire.",
                "Founded in 1891 and fronted by a striking art-deco facade, this cavernous classic cafe is the flagship for Fazer's chocolate empire. The glass cupola reflects sound, so locals say it’s a bad place to gossip. It's ideal, however, for buying dazzling confectionery, fresh bread, salmon or shrimp sandwiches, or digging into towering sundaes or spectacular cakes. Gluten-free dishes are available.",
                "Kluuvikatu 3", "+358-20-729-6702", "http://www.fazer.fi",
                "7.30am-10pm Mon-Fri, 9am-10pm Sat, 10am-6pm Sun",
                "dishes €3.90-12"));
        eatPlaces.add(new Place("Zucchini", "Vegetarian", R.drawable.restaurant_zucchini,
                "One of the city’s original and most popular vegetarian cafes.",
                "One of the city’s original and most popular vegetarian cafes, Zucchini is a top-notch lunch spot; queues out the door aren't unusual. Steaming soups banish winter chills, while freshly baked quiche on the sunny terrace is a summer treat. Year-round, you can choose soup or salad/hot dish or both. At least one vegan dish features on the daily changing menu.",
                "Fabianinkatu 4", "+358-96-222-907", "http://www.zucchini.fi",
                "11am-4pm Mon-Fri", "lunch mains €8-12"));
        eatPlaces.add(new Place("Kosmos", "Finnish", R.drawable.restaurant_kosmos,
                "Designed by Alvar Aalto, and with a bohemian history, this nonagenarian place is a Helsinki classic.",
                "Designed by Alvar Aalto, and with a bohemian history, this nonagenarian place is a Helsinki classic. It combines a staid, very traditionally Finnish atmosphere with tasty not-very-modern dishes, including reindeer, sweetbreads, kidneys and succulent fish options. Service can be no-nonsense but comes straight from the days when waiting tables was a career.",
                "Kalevankatu 3", " 0+358-96-472-55", "http://www.kosmos.fi",
                "11.30am-1am Mon-Fri, 4pm-1am Sa",
                "mains €20-34"));
        eatPlaces.add(new Place("Juuri", "Finnish", R.drawable.restaurant_juuri,
                "Creative takes on classic Finnish ingredients draw the crowds to this stylish modern restaurant.",
                "Creative takes on classic Finnish ingredients draw the crowds to this stylish modern restaurant, but the best way to eat is to sample the ‘sapas’, which are tapas with a Suomi twist (€4.70 per plate). You might graze on marinated fish, smoked beef or homemade sausages. There are good lunches too, but they’re not as interesting.",
                "Korkeavuorenkatu 27", "+358-96-357-32", "ttp://www.juuri.fi",
                "1am-2.30pm & 4-10pm Mon-Fri, 4-10pm Sat & Sun",
                "mains €28-30"));
        return eatPlaces;
    }

    static public ArrayList<Place> getSleepPlaces(){
        ArrayList<Place> sleepPlaces = new ArrayList<>();
        sleepPlaces.add(new Place("Hotel Haven", "TOP CHOICE", R.drawable.hotel_haven,
                "The closest hotel to the kauppatori is elegant, welcoming and scores high on all levels.",
                "The closest hotel to the kauppatori is elegant, welcoming and scores high on all levels. All room grades feature excellent beds and linen, soft colour combinations, classy toiletries and thoughtful extras like sockets in the safes. ‘Comfort’ rooms face the street and are very spacious; higher grades give add-ons – like a Nespresso machine in ‘Lux’ category – and some offer a magnificent harbour view.",
                "Unioninkatu 17", "+358-96-81-930",
                "https://www.hotelhaven.fi"));
        sleepPlaces.add(new Place("Hotel Katajanokka", "TOP CHOICE", R.drawable.hotel_katajanokka,
                "Set in a refurbished prison, this place offers character in spades on Katajanokka island.",
                "Set in a refurbished prison, this place offers character in spades on Katajanokka island. Rooms stretch over two to three ex-cells, so they’re anything but pokey, and boast not slop buckets but sleek modern bathrooms. Penitentiary jokes – handcuffs for sale at reception – aside, there's plenty of luxury and a sumptuous sauna. Tram 4 stops right outside. This jailhouse rocks.",
                "Merikasarminkatu 1A", "+358-96-86-450",
                "www.hotelkatajanokka.fi/en/"));
        sleepPlaces.add(new Place("Hotel F6", "TOP CHOICE", R.drawable.hotel_f6,
                "Stunningly designed, this hotel opened in 2016 and ranges around an internal courtyard.",
                "Stunningly designed, this hotel opened in 2016 and ranges around an internal courtyard (some rooms have direct access and patios); superior rooms come with French balconies. All 66 rooms are spacious (even the smallest are 27 sq m) and stylishly furnished with cushion-strewn sofas. The courtyard also has a herb garden supplying the bar. Breakfast is organic; wind and water powers all electricity.",
                "Fabianinkatu 6", "+358-968-999-666",
                "https://www.hotelf6.fi"));
        sleepPlaces.add(new Place("Hostel Diana Park", "HOSTEL", R.drawable.hotel_hostel_diana,
                "More like a guesthouse, Helsinki’s most characterful and laid-back hostel occupies the top floor of a building in a lively street of bars and restaurants.",
                "More like a guesthouse, Helsinki’s most characterful and laid-back hostel occupies the top floor of a building in a lively street of bars and restaurants. Its 50 beds are spread across 15 rooms; all share bathrooms but have in-room sinks. Private rooms offer more peace and there's a great lounge for socialising. HI members get 10% off; breakfast costs €7.",
                "Uudenmaankatu 9", "+358-96-42-169",
                "www.dianapark.fi/"));
        sleepPlaces.add(new Place("GLO Hotel Kluuvi", "HOTEL IN CITY CENTRE", R.drawable.hotel_glo_kluuvi,
                "There are no starched suits at reception at this laidback designer joint, and the relaxed atmosphere continues through the comfortably modish public areas to the rooms.",
                "There are no starched suits at reception at this laidback designer joint, and the relaxed atmosphere continues through the comfortably modish public areas to the rooms. Beds: exceptionally inviting. Facilities: top notch and mostly free. Location: on a pedestrian street in the heart of town. Cute extra: a stuffed tiger toy atop the covers.",
                "Kluuvikatu 4", "0103 444400",
                "www.glohotels.fi/en/hotels/glo-kluuvi"));
        sleepPlaces.add(new Place("Hellsten Helsinki Parliament", "APARTMENT", R.drawable.hotel_hellsten,
                "A step up in style and comfort from many hotels, the apartments here have sleek modern furnishings, kitchenette, internet connections and cable TV.",
                "A step up in style and comfort from many hotels, the apartments here have sleek modern furnishings, kitchenette, internet connections and cable TV. Prices vary seasonally and there are discounts for longer stays. It’s in a great location. You will receive a keycode if you arrive outside hours.",
                "Museokatu 18", "+358-92-511-050",
                "http://hellstenhotels.fi/Hellsten_Hotel_Apartments"));

        return sleepPlaces;
    }

    static public ArrayList<Place> getPlayPlaces(){
        ArrayList<Place> playPlaces = new ArrayList<>();
        playPlaces.add(new Place("Flamingo Spa", "Spa", R.drawable.activity_flamingo_spa,
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults.",
                "Flamingo Spa is a complex of a wonderful Waterpark for families and a peaceful Spa area only for adults. If you get hungry Spa Cafe is here for you with its delicious menu. Adult Spa is full of amazing treatments so you can get a total relaxation on your day off. For the youngsters we have an indoor playpark called Naurusaari where children can play and have fun.",
                "Tasetie 8, 01510 Vantaa", "+358-207-785-201",
                "http://www.flamingospa.fi/Home",
                "10am-9pm Mon-Sat, 10am-6pm Sun",
                "price varies from 10€ to 68€ based on time and service types")
        );
        playPlaces.add(new Place("Restaurant Day", "Event", R.drawable.activity_restaurant_day,
                "Restaurant Day is a worldwide food carnival and a movement that allows anyone to set up a restaurant, café or a bar.",
                "Restaurant Day is a worldwide food carnival and a movement that allows anyone to set up a restaurant, café or a bar. Pop-up restaurants can be opened and local food carnivals can happen anytime and anywhere: at your home, at the office, on a street corner, in your garden or inner courtyard, at a park, or on the beach – only your imagination is the limit.",
                "Here and there", "N/A",
                "http://www.restaurantday.org/en/",
                "Next restaurant day is 20.05.2017",
                "Price varies from stand to stand")
        );
        playPlaces.add(new Place("Cosy Finnish Sauna Evening", "Sauna", R.drawable.activity_finnish_sauna,
                "Visit in a private home including a possibility to experience sauna.",
                "Visit in a private home including a possibility to experience sauna. During the visit the host tells about sauna habits and if you wish, you may try sauna. Light sauna-meal or sauna-coffee is served.",
                "Here and there", "N/A",
                "http://www.visitfinland.com/mystay/15917/",
                "Agree with local host",
                "Agree with local host")
        );
        playPlaces.add(new Place("Lux Helsinki Light Festival", "Event", R.drawable.activity_lux_light_festival,
                "Lux Helsinki will offer inspiring light artworks and a festival atmosphere at the darkest time of the year.",
                "Lux Helsinki will offer inspiring light artworks and a festival atmosphere at the darkest time of the year. The most exciting artists from Finland and all around the world will create artworks in Helsinki city centre. Lux Helsinki is suitable for the whole family and entry is free of charge. The festival will be organised by the City of Helsinki.",
                "In city center of Helsinki", "N/A",
                "http://www.luxhelsinki.fi/en/index.html",
                "The next Lux Helsinki festival will take place in 6-10 January 2018.",
                "Free entrance")
        );
        playPlaces.add(new Place("Cleaning day", "Event", R.drawable.activity_siivous_paiva,
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling.",
                "Cleaning Day is a new day of celebration for friends of flea markets and recycling. The neatest festival of the year changes cities and neighborhoods into huge flea markets and marketplaces. Anyone can offer their second hand items up for sale on the streets, yards and at home, as well as make the best finds of the day.",
                "Here and there", "N/A",
                "http://siivouspaiva.com/en/cleaningday",
                "The next clearning day will take place on Saturday 27 May 2017..",
                "Free entrance")
        );
        playPlaces.add(new Place("Helsinki City Marathon", "Fortress", R.drawable.activity_helsinki_city_marathon,
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. ",
                "The biggest marathon event in Finland, Helsinki City Marathon, collects over 4500 runners around the world to see the beautiful city of Helsinki. Route takes runners thrue the city and shows also the beautiful seaside of Helsinki.",
                "Helsinki city center", "+358-295-338-410",
                "http://www.suomenlinna.fi/en/",
                "12/08/2017 - 3:00pm",
                "Registration fee varies from 50 to 96 euros")
        );
        return playPlaces;
    }

}
