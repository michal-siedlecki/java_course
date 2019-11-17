package com.siedlecki;

public class Main {

    public static void main(String[] args) {


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int playersScore){
        int position = calculatePosition(playersScore);
        System.out.println(playersName + " managed to get into position " + position);
    }

    public static int calculatePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;
    }


}
