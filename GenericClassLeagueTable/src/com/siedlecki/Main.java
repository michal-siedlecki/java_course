package com.siedlecki;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.


import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballTeam orlando = new FootballTeam("Orlando Beasts", 3,0,0);
        FootballTeam rangers = new FootballTeam("Texas Rangers", 5,0,0);
        FootballTeam bufallo = new FootballTeam("Bufallo Bulls", 6,0,0);
        FootballTeam arizona = new FootballTeam("Arizona Cardinals", 4,0,0);
        FootballTeam detroit = new FootballTeam("Detroit Lions", 7,0,0);
        FootballTeam orleans = new FootballTeam("New Orleans Saints", 2,0,0);
        
        BaseballTeam fighters = new BaseballTeam("Vancouver Fighters", 6,5,3);
        BaseballTeam eagles = new BaseballTeam("Washington Eagles", 4,2,6);
        
        LeagueTable<FootballTeam> footballLeague = new LeagueTable<>();

        footballLeague.addTeam(orlando);
        footballLeague.addTeam(rangers);
        footballLeague.addTeam(bufallo);
        footballLeague.addTeam(arizona);
        footballLeague.addTeam(detroit);
        footballLeague.addTeam(orleans);

//        footballLeague.addTeam(eagles); <---- holds type :)

        footballLeague.printSorted();

    }
}
