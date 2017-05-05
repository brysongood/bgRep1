package com.example.brysongood.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private static final String TAG = DisplayMessageActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate() started");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        message = "Hello, " + message;

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

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
