package com.siedlecki;

public class Team {
    String name;
    int won;
    int lost;
    int tied;

    public Team(String name, int won, int lost, int tied) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.tied = tied;
    }

    public String getName(){
        return name;
    }

    public int getRank(){
        return (won*2)+tied;
    }
}
