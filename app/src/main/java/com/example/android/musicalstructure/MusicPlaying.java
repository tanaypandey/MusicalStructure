package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MusicPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_playing_activity);

        //initioalise all the views in music playing activity
        TextView albumName = (TextView)findViewById(R.id.album_name);
        TextView songName = (TextView)findViewById(R.id.song_name);
        TextView artistName = (TextView)findViewById(R.id.artist_name);
        ImageView albumArt = (ImageView)findViewById(R.id.album_art);
        Button backButton = (Button)findViewById(R.id.back_button);

        Bundle activity = getIntent().getExtras();
        int activity_number = -1; // or other values
        if(activity != null) activity_number = activity.getInt("activity_number");

        if(activity_number==1){
        //creating array list
            ArrayList<Music> musicDetails = new ArrayList<Music>();
            musicDetails.add(new Music("Hello","Adele","21",R.drawable.hello));
            musicDetails.add(new Music("All of Me","John Legend","AllSongs",R.drawable.allofme));
            musicDetails.add(new Music("All of us","Eskmo","13 Reasons Why",R.drawable.all_of_us));
            musicDetails.add(new Music("All Time Low","Jon Bellion","The Human Condition",R.drawable.alltimelow));
            musicDetails.add(new Music("Attention","Charlie Puth","Attention",R.drawable.attention));
            musicDetails.add(new Music("Bad at Love","Halsey","hopeless fountain kingdom",R.drawable.badatlove));
            musicDetails.add(new Music("Believer","Imagine Dragons","Evolve",R.drawable.believer));
            musicDetails.add(new Music("Breaking Free","Night Riots","Love Gloom",R.drawable.breakingfree));
            musicDetails.add(new Music("Channa Mereya","Pritam","Ae Dil Hai Mushkil",R.drawable.chanamereya));
            musicDetails.add(new Music("Demons","Imagine Dragons","Evolve",R.drawable.demons));
            musicDetails.add(new Music("Done For Me","Charlie Puth","Single",R.drawable.doneforme));
            musicDetails.add(new Music("Dusk Till Dawn","ZAYN","Dusk Till Dawn",R.drawable.dusktilldawn));
            musicDetails.add(new Music("Feel It Still","Portugal. The Man","Feel It Still",R.drawable.feelitstill));
            musicDetails.add(new Music("Girls Like You","Maroon 5","Single",R.drawable.girlslikeyou));
            musicDetails.add(new Music("God's Plan","Drake","Scorpion",R.drawable.godsplan));
            musicDetails.add(new Music("Havana","Camila Cabello","Camila",R.drawable.havana));
            musicDetails.add(new Music("Hoor","Atif Aslam","Hindi Medium",R.drawable.hoor));
            musicDetails.add(new Music("Ilahi","Arijit Singh","Yeh Jawaani Hai Deewani",R.drawable.yjhd));
            musicDetails.add(new Music("In My Feelings","Drake","Scorpion",R.drawable.inmyfeelings));
            musicDetails.add(new Music("Kabira","Tochi Raina","Yeh Jawaani Hai Deewani",R.drawable.yjhd));

        //recieve the position of the list
        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null) value = b.getInt("key");
        albumName.setText(musicDetails.get(value).getmAlbumName());
        albumArt.setImageResource(musicDetails.get(value).getmAlbumArtId());
        songName.setText(musicDetails.get(value).getmSongName());
        artistName.setText(musicDetails.get(value).getmArtistName());
        }
       else if(activity_number==2){
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

            //recieve the position of the list
            Bundle b = getIntent().getExtras();
            int value = -1; // or other values
            if(b != null) value = b.getInt("key");
            albumName.setText(musicDetails.get(value).getmAlbumName());
            albumArt.setImageResource(musicDetails.get(value).getmAlbumArtId());
            songName.setText(musicDetails.get(value).getmSongName());
            artistName.setText(musicDetails.get(value).getmArtistName());
        }
        else{
            //creating array list
            ArrayList<Music> musicDetails = new ArrayList<Music>();
            musicDetails.add(new Music("Hello","Adele","21",R.drawable.hello));
            musicDetails.add(new Music("All of Me","John Legend","AllSongs",R.drawable.allofme));
            musicDetails.add(new Music("All of us","Eskmo","13 Reasons Why",R.drawable.all_of_us));
            musicDetails.add(new Music("All Time Low","Jon Bellion","The Human Condition",R.drawable.alltimelow));
            musicDetails.add(new Music("Attention","Charlie Puth","Attention",R.drawable.attention));
            musicDetails.add(new Music("Bad at Love","Halsey","hopeless fountain kingdom",R.drawable.badatlove));
            musicDetails.add(new Music("Believer","Imagine Dragons","Evolve",R.drawable.believer));
            musicDetails.add(new Music("Breaking Free","Night Riots","Love Gloom",R.drawable.breakingfree));
            musicDetails.add(new Music("Channa Mereya","Pritam","Ae Dil Hai Mushkil",R.drawable.chanamereya));
            musicDetails.add(new Music("Demons","Imagine Dragons","Evolve",R.drawable.demons));
            musicDetails.add(new Music("Done For Me","Charlie Puth","Single",R.drawable.doneforme));
            musicDetails.add(new Music("Dusk Till Dawn","ZAYN","Dusk Till Dawn",R.drawable.dusktilldawn));
            musicDetails.add(new Music("Feel It Still","Portugal. The Man","Feel It Still",R.drawable.feelitstill));
            musicDetails.add(new Music("Girls Like You","Maroon 5","Single",R.drawable.girlslikeyou));
            musicDetails.add(new Music("God's Plan","Drake","Scorpion",R.drawable.godsplan));
            musicDetails.add(new Music("Havana","Camila Cabello","Camila",R.drawable.havana));
            musicDetails.add(new Music("Hoor","Atif Aslam","Hindi Medium",R.drawable.hoor));
            musicDetails.add(new Music("Ilahi","Arijit Singh","Yeh Jawaani Hai Deewani",R.drawable.yjhd));
            musicDetails.add(new Music("In My Feelings","Drake","Scorpion",R.drawable.inmyfeelings));
            musicDetails.add(new Music("Kabira","Tochi Raina","Yeh Jawaani Hai Deewani",R.drawable.yjhd));

            //recieve the position of the list
            Bundle b = getIntent().getExtras();
            int value = -1; // or other values
            if(b != null) value = b.getInt("key");
            albumName.setText(musicDetails.get(value).getmAlbumName());
            albumArt.setImageResource(musicDetails.get(value).getmAlbumArtId());
            songName.setText(musicDetails.get(value).getmSongName());
            artistName.setText(musicDetails.get(value).getmArtistName());

        }
        //implementing back button to return to the specified activiities when pressed
        if (activity_number==1){
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backIntent = new Intent(MusicPlaying.this,MyMusic_activity.class);
                    startActivity(backIntent);
                }
            });
        }
        else if(activity_number==2){
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backIntent = new Intent(MusicPlaying.this,Recents_activity.class);
                    startActivity(backIntent);
                }
            });
        }
        else{
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backIntent = new Intent(MusicPlaying.this,Discover_activities.class);
                    startActivity(backIntent);
                }
            });
        }
    }
}