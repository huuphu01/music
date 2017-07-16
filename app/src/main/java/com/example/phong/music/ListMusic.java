package com.example.phong.music;

/**
 * Created by Calm on 7/16/2017.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.phong.music.R.styleable.View;

public class ListMusic extends  AppCompatActivity {

    ArrayList<Song> arrayListSong ;
    ListView lvSong;
    MyAdapterMusic adapter;
    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listmusic_fragment_layout);
        AnhXa();
        AddSong();
        MyAdapterMusic mayArr = new MyAdapterMusic(ListMusic.this, R.layout.item_list_music, arrayListSong);
        lvSong.setAdapter(mayArr);


    }
    private void AnhXa()
    {
        lvSong = (ListView) findViewById(R.id.lvSong);

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
