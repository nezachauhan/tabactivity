package com.example.nezachauhan.tabactivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabLayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Men");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Men");
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabSpec songspec = tabHost.newTabSpec("Women");
        songspec.setIndicator("Women");
        Intent songsIntent = new Intent(this, SongsActivity.class);
        songspec.setContent(songsIntent);

        // Tab for Videos
        TabSpec videospec = tabHost.newTabSpec("Kids");
        videospec.setIndicator("Kids");
        Intent videosIntent = new Intent(this, VideosActivity.class);
        videospec.setContent(videosIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab


         }
}
