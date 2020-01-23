package com.siedlecki;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songList;

    public Album(String name) {
        this.name = name;
        this.songList = new ArrayList<Song>();
    }

    public void addSong(Song song){
        if (!this.hasSong(song)){
            this.songList.add(song);
        }
    }

    private boolean hasSong(Song song){
        return this.songList.contains(song);
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }
}
