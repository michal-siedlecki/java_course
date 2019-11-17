package com.siedlecki;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 3;
        char myChar = 'd';
        System.out.println( myChar + result);

        result++;
        System.out.println(result);

        result--;
        result /=2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("cool");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("either both conditions are true");
        }

        boolean isCar = true;
        if (!isCar){
            System.out.println("This is not a car");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("that was car");
        }

    }
}
