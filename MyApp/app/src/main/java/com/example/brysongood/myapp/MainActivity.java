package com.example.brysongood.myapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    // Set Constants
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    // Whether the display should be refreshed.
    public static boolean refreshDisplay = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Log.d(TAG, "Display Trail List Clicked");

                        Intent trailList = new Intent(MainActivity.this, DisplayTrailList.class);
                        startActivity(trailList);

                        Toast.makeText(MainActivity.this, "Viewing Trail List",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Log.d(TAG, "Display About Clicked");
                        Intent about = new Intent(MainActivity.this, DisplayAbout.class);
                        startActivity(about);

                        Toast.makeText(MainActivity.this, "Viewing About",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Log.d(TAG, "Display your location Clicked");
                        Intent myLocation = new Intent(MainActivity.this, activityMyLocation.class);
                        startActivity(myLocation);

                        Toast.makeText(MainActivity.this, "Viewing your location",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Log.d(TAG, "Display case 3 Clicked");
                        Toast.makeText(MainActivity.this, "" + position,
                                Toast.LENGTH_SHORT).show();
                         /* Intent settings = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(settings);
                        */
                        break;
                }


            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "fab clicked, onClick started");
                rateDialogBuilder();
            };
        });

    }


    public void rateDialogBuilder() {
        Log.d(TAG, "rateDialogBuilder started");
        // Use the Builder class for convenient dialog construction


        final AlertDialog.Builder hikeTipDialog = new AlertDialog.Builder(MainActivity.this);
        hikeTipDialog.setTitle(R.string.hike_tip_title)
                .setMessage(R.string.tip_message_1)
                .setPositiveButton("Great Tip!", new OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.d(TAG, "Great Tip clicked for, Dialog Dismissed.");
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.d(TAG, "Dismiss clicked");
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        AlertDialog alertDialog = hikeTipDialog.create();
        alertDialog.show();
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
                Intent about = new Intent(MainActivity.this, DisplayAbout.class);
                startActivity(about);
                return true;

            case R.id.action_hike_list:
                Log.d(TAG, "action_hike_list selected");
                Intent trailList = new Intent(MainActivity.this, DisplayTrailList.class);
                startActivity(trailList);
                return true;

            case R.id.action_home:
                Log.d(TAG, "action_home selected");
                // Display Toast
                Toast.makeText(MainActivity.this, "Home",
                        Toast.LENGTH_SHORT).show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return onOptionsItemSelected(item);

        }
    }

    /** Called when the user taps the Send button
     public void sendMessage(View view) {
     Intent intent = new Intent(this, DisplayMessageActivity.class);
     EditText editText = (EditText) findViewById(R.id.editText);
     String message = editText.getText().toString();
     intent.putExtra(EXTRA_MESSAGE, message);
     startActivity(intent);
     }
     */



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

    public void onDestroy() {
        Log.d(TAG, "onDestroy() started");
        super.onDestroy();
    }

}



