package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Recents_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        ArrayList<Music> musicDetails = new ArrayList<Music>();
        musicDetails.add(new Music("All of Me","John Legend","AllSongs",R.drawable.allofme));
        musicDetails.add(new Music("All of us","Eskmo","13 Reasons Why",R.drawable.all_of_us));
        musicDetails.add(new Music("Bad at Love","Halsey","hopeless fountain kingdom",R.drawable.badatlove));
        musicDetails.add(new Music("Believer","Imagine Dragons","Evolve",R.drawable.believer));
        musicDetails.add(new Music("Done For Me","Charlie Puth","Single",R.drawable.doneforme));
        musicDetails.add(new Music("Dusk Till Dawn","ZAYN","Dusk Till Dawn",R.drawable.dusktilldawn));
        musicDetails.add(new Music("Feel It Still","Portugal. The Man","Feel It Still",R.drawable.feelitstill));
        musicDetails.add(new Music("God's Plan","Drake","Scorpion",R.drawable.godsplan));
        musicDetails.add(new Music("Havana","Camila Cabello","Camila",R.drawable.havana));
        musicDetails.add(new Music("Hoor","Atif Aslam","Hindi Medium",R.drawable.hoor));
        musicDetails.add(new Music("Ilahi","Arijit Singh","Yeh Jawaani Hai Deewani",R.drawable.yjhd));
        musicDetails.add(new Music("In My Feelings","Drake","Scorpion",R.drawable.inmyfeelings));
        musicDetails.add(new Music("Kabira","Tochi Raina","Yeh Jawaani Hai Deewani",R.drawable.yjhd));

        //creating adapter
        MusicAdapter adapter = new MusicAdapter(this,musicDetails);

        //setting adapter to list view
        ListView listView = (ListView) findViewById(R.id.list);

        //sart adapter
        listView.setAdapter(adapter);

        //making list items clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent playMusic = new Intent(Recents_activity.this, MusicPlaying.class);
                //creating bundle to send the position in the array
                Bundle b = new Bundle();
                b.putInt("key",position);
                playMusic.putExtras(b);
                //creating bundle to send the activity name/number
                Bundle activity = new Bundle();
                activity.putInt("activity_number",2);
                playMusic.putExtras(activity);
                //start the activity playMusic
                startActivity(playMusic);
                finish();
            }
        });
    }
}
