package com.example.nezachauhan.tabactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        getSupportActionBar().hide();

    }
}
