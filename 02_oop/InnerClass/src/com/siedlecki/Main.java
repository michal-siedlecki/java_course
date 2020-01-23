package com.siedlecki;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()



// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.



import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        boolean goForward = true;
        boolean flag = false;
        LinkedList<Song> playlist = new LinkedList<Song>();

        Song currentSong = new Song("default", 1);

        Song speak = new Song("Speak to me", 450);
        Song on = new Song("On the run", 450);
        Song time = new Song("Time", 450);

        Song another_1 = new Song("Another Brick in the Wall part 1", 450);
        Song another_2 = new Song("Another Brick in the Wall part 2", 450);
        Song mother = new Song("Mother", 450);
        
        Album wall = new Album("Wall");
        Album dark = new Album("Dark side of the moon");
        
        dark.addSong(speak);
        dark.addSong(on);
        dark.addSong(time);

        wall.addSong(another_1);
        wall.addSong(another_2);
        wall.addSong(mother);
        addToPlaylist(playlist, wall);
        addToPlaylist(playlist, dark);
        ListIterator<Song> playlistIterator = playlist.listIterator();


        while (!quit){

            printMenu();
            switch (getChoise()){
                case 1:
                    quit = true;
                    break;
                case 2:
                    if (playlistIterator.hasNext()){
                        if (goForward){
                            System.out.println("Now playing: ");
                            currentSong = playlistIterator.next();
                            System.out.println(currentSong.getName());
                        } else {
                            playlistIterator.next();
                            currentSong = playlistIterator.next();
                            System.out.println(currentSong.getName());
                            goForward = true;
                        }

                    }else {
                        System.out.println("You are at the end of the playlist");
                    }
                    break;
                case 3:
                    if (playlistIterator.hasPrevious()){
                        if (!goForward){
                            System.out.println("Now playing: ");
                            currentSong = playlistIterator.previous();
                            System.out.println(currentSong.getName());
                        } else {
                            playlistIterator.previous();
                            currentSong = playlistIterator.previous();
                            System.out.println(currentSong.getName());
                            goForward = false;
                        }

                    }else {
                        System.out.println("You are at the beginning of the playlist");
                    }
                    break;
                case 4:
                    System.out.println("Now playing: ");
                    System.out.println(currentSong.getName());
                    break;
                case 5:
                    if (playlist.size()>0){printPlaylist(playlist);
                    } else {
                        System.out.println("playlist is empty");
                    }


                    break;
                case 6:
                    if (playlistIterator.previousIndex() != -1){
                        if(playlist.size()>0) {
                            playlistIterator.remove();
                            if (playlist.size() > 0) {
                                if (playlistIterator.hasNext()) {
                                    playlistIterator.next();
                                } else  {
                                    playlistIterator.previous();
                                }
                            }
                        }
                    } else {
                        System.out.println("song not selected");
                    }

            }
        }

    }

    public static void printMenu(){
        System.out.println("\n1. Quit\n" +
                "2. Skip forward to the next song\n" +
                "3. Skip backwards to a previous song\n" +
                "4. Replay the current song\n" +
                "5. List the songs in the playlist\n" +
                "6. Remove current from hte playlist\n");
    }

    public static int getChoise(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printPlaylist(LinkedList<Song> playlist){
        ListIterator<Song> iterator = playlist.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }

    public static LinkedList<Song> addToPlaylist(LinkedList<Song> playlist, Album album){
        for (int i=0; i<album.getSongList().size(); i++){
            playlist.add(album.getSongList().get(i));
        }
        return playlist;
    }




}
