package com.may.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InterpretsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interprets);
        setContentView(R.layout.activity_albums);
        TextView listelem= (TextView) findViewById(R.id.listelem);
        String message= getResources().getString(R.string.dummymessage1)+" artists "+getResources().getString(R.string.dummymessage2);
        listelem.setText(message);
        TextView playlists = (TextView) findViewById(R.id.Playlists);
        TextView songs = (TextView) findViewById(R.id.Songs);
        TextView albums = (TextView) findViewById(R.id.Albums);
        TextView interprets = (TextView) findViewById(R.id.Interprets);

        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(InterpretsActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
                finish();
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(InterpretsActivity.this, SongsActivity.class);
                startActivity(numbersIntent);
                finish();
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(InterpretsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
                finish();
            }
        });

        interprets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You're here already!", Toast.LENGTH_SHORT).show();
            }
        });








    }
}
