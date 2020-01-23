package com.siedlecki;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private ArrayList<T> members = new ArrayList<>();
    private int won;
    private int lost;
    private int tied;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T newPlayer){
        if (members.contains(newPlayer)){
            System.out.println(newPlayer.getName() + " is already in the team");
            return false;
        } else {
            members.add(newPlayer);
            System.out.println(newPlayer.getName() + " added to " + this.getName());
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore>theirScore){
            won++;
            message = " won with ";
        } else if (ourScore<theirScore){
            lost++;
            message = " lost with ";
        } else {
            tied++;
            message = " tied to ";
        }
        if (opponent != null){
            System.out.println(this.getName()+ message + opponent.getName());
            matchResult(null, theirScore, ourScore);
        }
    }

    public int getNumPlayers(){
        return members.size();
    }

    public int getRank(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRank()>team.getRank()){
            return -1;
        } else if (this.getRank()<team.getRank()){
            return 1;
        } else {
            return 0;
        }
    }
}
