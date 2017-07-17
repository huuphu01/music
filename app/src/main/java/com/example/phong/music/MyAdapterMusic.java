package com.example.phong.music;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Calm on 7/16/2017.
 */

public class MyAdapterMusic  extends ArrayAdapter<Song> {

    Activity context = null;
    int layoutId;
    ArrayList<Song> arr = null;

    public MyAdapterMusic(Activity context, int layoutId, ArrayList<Song> list){
        super(context, layoutId, list);
        this.context = context;
        this.layoutId = layoutId;
        this.arr = list;
    }



    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        LayoutInflater inflater =
                context.getLayoutInflater();
        convertView = inflater.inflate(layoutId, null);

        Song song = arr.get(position);
        //Lấy ra những control được định nghĩa trong cấu trúc của mỗi item
        TextView txtTitle = (TextView) convertView.findViewById(R.id.txtitem_song);
        //Gán giá trị cho những control đó
        txtTitle.setText(song.getTitle());


        return convertView;
    }


}