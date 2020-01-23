package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(true,30));
        System.out.println(isCatPlaying(false,20));
        System.out.println(isCatPlaying(false,45));
        System.out.println(isCatPlaying(true,25));



    }
    public static boolean isCatPlaying(boolean summer, int temperature){

        if (summer) {
            if ((temperature>=25) && (temperature<=45)){
                return true;
            }
            return false;
        } else if ((temperature>=25) && (temperature<=35)) {
            return true;
        }
        return false;

    }


}


//} else if (first == second){
//        if (second == third){
//        System.out.println("All numbers are equal");
//        }
//        System.out.println("Neither all are equal or different");
//        } else if (second == third) {
//        System.out.println("Neither all are equal or different");
//        } else {
//        System.out.println("All numbers are different");
//        }