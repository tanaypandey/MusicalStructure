package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialising mymusic text view
        TextView myMusic = (TextView)findViewById(R.id.My_music);
        //onclick listener for mmusic text view
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myMusicIntent = new Intent(MainActivity.this,MyMusic_activity.class);
                //startIntent
                startActivity(myMusicIntent);
            }
        });

        //initialising Recent text view
        TextView recent = (TextView)findViewById(R.id.Recent);
        //onclick listener for Recent text view
        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recentIntent = new Intent(MainActivity.this,Recents_activity.class);
                //startIntent
                startActivity(recentIntent);
            }
        });

        //initialising discover text view
        TextView discover = (TextView)findViewById(R.id.Discover);
        //onclick listener for mmusic text view
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverIntent = new Intent(MainActivity.this,Discover_activities.class);
                //startIntent
                startActivity(discoverIntent);
            }
        });
    }
}
