package com.example.android.helsinkiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.place_details_list_item);
        setContentView(R.layout.place_list);

        // Get the position of item clicked from EatFragment
        Bundle extras = getIntent().getExtras();

        // Get the current place
        Place currentDetailsPlace = extras.getParcelable("currentPlace");
        String title = extras.getString("title");
        this.setTitle(title);

        // Create an ArrayList
        final ArrayList<Place> currentPlace = new ArrayList<>();

        // Add the current place to the currentPlace ArrayList
        currentPlace.add(currentDetailsPlace);

        // Create adapter and set it with the place_list
        DetailsAdapter detailsAdapter = new DetailsAdapter(this, currentPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(detailsAdapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
