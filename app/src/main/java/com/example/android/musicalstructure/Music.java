package com.example.android.musicalstructure;

import android.media.Image;
import android.widget.ImageView;

public class Music {
    //song details
    private String mSongName;
    private String mArtistName;
    private int mAlbumArtId;
    private String mAlbumName;

    //constructor definition
    public Music(String SongName, String ArtistName, String AlbumName, int AlbumArtId){
        mSongName =SongName;
        mArtistName = ArtistName;
        mAlbumArtId = AlbumArtId;
        mAlbumName = AlbumName;
    }

    //return Function
    public String getmSongName() {
        return mSongName;
    }
    public String getmArtistName(){
        return mArtistName;
    }
    public String getmAlbumName() {
        return mAlbumName;
    }
    public int getmAlbumArtId(){
        return mAlbumArtId;
    }
}
