package com.example.brysongood.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DisplayAbout extends AppCompatActivity {
    private static final String TAG = DisplayAbout.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

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
                // Display Toast
                Toast.makeText(DisplayAbout.this, "Viewing About",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_hike_list:
                Log.d(TAG, "action_hike selected");
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent trailList = new Intent(DisplayAbout.this, DisplayTrailList.class);
                startActivity(trailList);
                return true;

            case R.id.action_home:
                Log.d(TAG, "action_home selected");
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent home = new Intent(DisplayAbout.this, MainActivity.class);
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
