package com.siedlecki;

import java.util.Comparator;

public class SortByRank implements Comparator<Team> {
    @Override
    public int compare(Team team_1, Team team_2) {
        return team_2.getRank()-team_1.getRank();
    }
}
