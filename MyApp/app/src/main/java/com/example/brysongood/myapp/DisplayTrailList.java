package com.example.brysongood.myapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by brysongood on 4/26/17.
 */

public class DisplayTrailList extends AppCompatActivity {
    private static final String TAG = DisplayTrailList.class.getSimpleName();

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    String[][] trailList= {
        {"Cherry Creek Falls","Stevens Pass, WA", "5.0 miles"},
        {"Lincoln Park","Seattle, WA", "1.85 miles"},
        {"Discovery Park","Seattle, WA", "2.8 miles"},
        {"Rattlesnake Ledge","North Bend, WA", "4.0 miles"},
        {"Alta Lake","North Cascades, WA", "2.0 miles"},
        {"Twin Falls","North Bend, WA", "2.6 miles"},
        {"Wallace Falls","Stevens Pass, WA", "5.6 miles"},
        {"Cape Horn Loop","Columbia River Gorge, WA", "7.6 miles"},
        {"Ape Canyon","Mount St. Helens, WA", "9.6 miles"},
        {"Goat Lake","Goat Rocks, WA", "13.6 miles"},
        {"Clear Lake","Goat Rocks, WA", "8.5 miles"},
        {"Bird Creek Meadows","Goat Rocks, WA", "6.1 miles"},
        {"Table Mountain","Mount Baker Area, WA", "3.0 miles"},
        {"Hurrican Hill Trail","Western Olympic Peninsula, WA", "3.0 miles"},
        {"Sol Duc Falls","Western Olympic Peninsula, WA", "1.60 miles"},
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() started");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_trail_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);

        recylerViewLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, trailList);

        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Log.d(TAG, "action_about selected");
                Intent about = new Intent(DisplayTrailList.this, DisplayAbout.class);
                startActivity(about);
                return true;

            case R.id.action_hike_list:
                Log.d(TAG, "action_hike_list selected");

                // Display Toast
                Toast.makeText(DisplayTrailList.this, "Viewing Trail List",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_home:
                Log.d(TAG, "action_home selected");
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent home = new Intent(DisplayTrailList.this, MainActivity.class);
                startActivity(home);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    @Override
    public void onStart() {
        Log.d(TAG, "onStart() started");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume() started");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause() started");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop() started");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy() started");
        super.onDestroy();
    }
}



