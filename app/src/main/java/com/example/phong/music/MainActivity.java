package com.example.phong.music;
/**
 * Created by phong on 12/5/2016.
 */
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ImageButton btnPlay;
    private ImageButton btnRepeat;
    private ImageButton btnShuffle;
    private TextView txtStartTime;
    private TextView txtFinalTime;
    private TextView songName;
    private ImageView iv;
    ArrayList<Song> arrayListSong;
    int position = 0;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_music_layout);
        AnhXa();
        AddSong();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer  = MediaPlayer.create(MainActivity.this,arrayListSong.get(position).getFile());
                songName.setText(arrayListSong.get(position).getTitle());
                mediaPlayer.start();
            }
        });
    }
    private void  laydata()
    {
        Intent i = getIntent();
        if (i != null) {
            Bundle b = i.getBundleExtra("position");
            if(b != null)
                position = b.getInt("position");

            Bundle b1 = i.getBundleExtra("data");
            if(b1 != null){
                String name = b1.getString("name");
            }
        }
    }
    private void  AnhXa()
    {
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        songName = (TextView) findViewById(R.id.txtitem_song);

    }
    private void AddSong()
    {
        arrayListSong = new ArrayList<>();
        arrayListSong.add(new Song("Anh Dang Noi Dau", R.raw.anh_dang_noi_dau));
        arrayListSong.add(new Song("Anh Không Sao Đâu", R.raw.anh_khong_sao_dau));
        arrayListSong.add(new Song("Yêu Khac Việt", R.raw.yeu_khacviet));
        arrayListSong.add(new Song("Anh Dang Noi Dau", R.raw.anh_dang_noi_dau));
        arrayListSong.add(new Song("Anh Không Sao Đâu", R.raw.anh_khong_sao_dau));
        arrayListSong.add(new Song("Yêu Khac Việt", R.raw.yeu_khacviet));
        arrayListSong.add(new Song("Anh Dang Noi Dau", R.raw.anh_dang_noi_dau));
        arrayListSong.add(new Song("Anh Không Sao Đâu", R.raw.anh_khong_sao_dau));
        arrayListSong.add(new Song("Yêu Khac Việt", R.raw.yeu_khacviet));
    }
}
