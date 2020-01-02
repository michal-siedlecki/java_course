package com.siedlecki;

import java.util.ArrayList;
import java.util.Collections;


public class LeagueTable<T extends Team>{

    ArrayList<Team> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T team){
        if (this.teams.contains(team)){
            System.out.println("this team is already included");
            return false;
        } else {
            this.teams.add(team);
            System.out.println(team.getName() + " added to league table");
            return true;
        }
    }

    public ArrayList<Team> getTeams(){
        return teams;
    }

    public void printSorted(){
        Collections.sort(teams, new SortByRank());
        int rankNumber = 1;
        for (Team team : teams){
            System.out.println(rankNumber + " " + team.getName());
            rankNumber ++;
        }
    }


}
