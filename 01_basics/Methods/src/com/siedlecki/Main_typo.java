package com.siedlecki;

public class Main_typo {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 8, 100);
        System.out.println("Your final score was : " + highScore);
        displayHighScorePosition("John", 1500);
        displayHighScorePosition("Alice", 900);
        displayHighScorePosition("Bob", 400);
        displayHighScorePosition("Eva", 50);
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
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
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
