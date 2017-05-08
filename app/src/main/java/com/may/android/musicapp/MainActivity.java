package com.may.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static boolean b_shuffle=true;
    public static boolean b_repeat=true;
    public static boolean b_playing =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    TextView playlists = (TextView) findViewById(R.id.Playlists);
    TextView songs = (TextView) findViewById(R.id.Songs);
    TextView albums = (TextView) findViewById(R.id.Albums);
    TextView interprets = (TextView) findViewById(R.id.Interprets);
    final ImageView shuffle = (ImageView) findViewById(R.id.shuffle);
    ImageView previous = (ImageView) findViewById(R.id.previous);
    final ImageView play = (ImageView) findViewById(R.id.play);
    ImageView next = (ImageView) findViewById(R.id.next);
    final ImageView repeat = (ImageView) findViewById(R.id.repeat);

    playlists.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers View is clicked on.
        @Override
        public void onClick(View view) {
            Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
            startActivity(playlistIntent);
        }
    });

        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(numbersIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        interprets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent interpretsIntent = new Intent(MainActivity.this, InterpretsActivity.class);
                startActivity(interpretsIntent);
            }
        });

        shuffle.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                if (b_shuffle){
                    b_shuffle=false;
                    shuffle.setImageResource(R.drawable.ic_trending_flat_black_48dp);
                    Toast.makeText(view.getContext(), "Shuffle off", Toast.LENGTH_SHORT).show();
                }
                else{
                    b_shuffle=true;
                    shuffle.setImageResource(R.drawable.ic_shuffle_black_48dp);
                    Toast.makeText(view.getContext(), "Shuffle on", Toast.LENGTH_SHORT).show();
                }
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Switch to previous song", Toast.LENGTH_SHORT).show();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                if (b_playing){
                    b_playing =false;
                    play.setImageResource(R.drawable.ic_play_circle_filled_black_48dp);
                    Toast.makeText(view.getContext(), "Music stops playing", Toast.LENGTH_SHORT).show();
                }
                else{
                    b_playing =true;
                    play.setImageResource(R.drawable.ic_pause_circle_filled_black_48dp);
                    Toast.makeText(view.getContext(), "Music starts playing", Toast.LENGTH_SHORT).show();
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Skip this song", Toast.LENGTH_SHORT).show();
            }
        });

        repeat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                if (b_repeat){
                    b_repeat=false;
                    repeat.setImageResource(R.drawable.ic_remove_circle_outline_black_48dp);
                    Toast.makeText(view.getContext(), "Repeat off", Toast.LENGTH_SHORT).show();
                }
                else{
                    b_repeat=true;
                    repeat.setImageResource(R.drawable.ic_repeat_black_48dp);
                    Toast.makeText(view.getContext(), "Repeat on", Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
}
