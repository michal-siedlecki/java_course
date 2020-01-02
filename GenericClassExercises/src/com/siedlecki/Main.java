package com.siedlecki;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseballPlayer jon = new BaseballPlayer("John");
        FootballPlayer tim = new FootballPlayer("Tim");

        Team<FootballPlayer> westEagles = new Team<>("West Eagles");

        westEagles.addPlayer(tim);

        System.out.println(westEagles.getNumPlayers());

        Team<BaseballPlayer> chicagoCups = new Team<>("Chicago Cups");
        chicagoCups.addPlayer(jon);


        Team<FootballPlayer> newYorkMasters = new Team<>("New York Masters");
        newYorkMasters.addPlayer(tim);

        newYorkMasters.matchResult(westEagles,3,5);
        newYorkMasters.matchResult(westEagles, 5,6);

    }
}
