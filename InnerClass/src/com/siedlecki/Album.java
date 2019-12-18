

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.


package com.siedlecki;

import java.util.ArrayList;

public class Album {
    private String name;
    private SongList songList;

    public Album(String name) {
        this.name = name;
        this.songList = new SongList();
    }

    public void addSong(Song song){
        if (!this.songList.hasSong(song)){
            this.songList.addSong(song);
        }
    }


    public ArrayList<Song> getSongList(){
        return this.songList.getTrackList();
    }



    private class SongList {
        private ArrayList<Song> trackList;

        public SongList() {
            this.trackList = new ArrayList<Song>();
        }

        public void addSong(Song song){
            this.trackList.add(song);
        }

        public boolean hasSong(Song song){
            return this.trackList.contains(song);
        }

        public ArrayList<Song> getTrackList() {
            return trackList;
        }

    }
}
