package com.example.phong.music;
/**
 * Created by phong on 12/5/2016.
 */
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    TextView txtTitle;
    ArrayList<Song> ArrSong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_music_layout);
        AnhXa();
    }
    private void  AnhXa()
    {
        btnPlay = (Button) findViewById(R.id.btnPlay);
        txtTitle = (TextView) findViewById(R.id.txtitem_song);
    }
}
