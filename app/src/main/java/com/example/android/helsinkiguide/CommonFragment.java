package com.example.android.helsinkiguide;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CommonFragment extends Fragment {

    public CommonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Place> targetList;
        String fragmentName = "";

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Get the target list
        targetList = new ArrayList<>();

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            targetList = bundle.getParcelableArrayList("placesList");
            fragmentName = bundle.getString("name");
        }

        // Create placeAdapter and set it with place_list
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        if (fragmentName.equals("seeFragment")){
            SeePlaceAdapter adapter = new SeePlaceAdapter(getActivity(), targetList);
            listView.setAdapter(adapter);
            // Set to have no divider
            listView.setDivider(null);
            listView.setDividerHeight(0);
        } else {
            PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), targetList);
            listView.setAdapter(placeAdapter);
        }

        final ArrayList<Place> finalTargetList = targetList;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the clicked list item at current position
                Place place = finalTargetList.get(position);

                // Turn to the page showing details of this place after certain item is clicked
                Intent intent = new Intent(getActivity(), DetailsActivity.class);

                // Pass a bundle which contains the place arraylist when constructing the activity
                Bundle newbundle = new Bundle();
                newbundle.putParcelableArrayList("placesList", finalTargetList);
                intent.putExtras(newbundle);

                // Put the position of the clicked item as extra information when turning to another activity.
                intent.putExtra("position", position);

                startActivity(intent);
            }
        });

        return rootView;
    }
}
