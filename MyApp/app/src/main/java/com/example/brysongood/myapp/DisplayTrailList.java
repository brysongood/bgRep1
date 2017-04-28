package com.example.brysongood.myapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.widget.RelativeLayout;

/**
 * Created by brysongood on 4/26/17.
 */

public class DisplayTrailList extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

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
}



