package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(1235));
        System.out.println(getDurationString(-45));
        System.out.println(getDurationString(3));
        System.out.println(getDurationString(160,0));
    }
    public static String getDurationString(int minutes, int seconds){
        if ((minutes<0)||((seconds<0)||(seconds>59))){
            return "Invalid value";
        }
        int hours = minutes/60;
        minutes %= 60;
        return (hours + "h " + minutes + "m " + seconds + "s ");
    }

    public static String getDurationString(int seconds){
        if (seconds<=0){
            return "Invalid value";
        }
        int minutes = seconds/60;
        int hours = minutes/60;
        minutes %= 60;
        seconds %= 60;

        return (hours + "h " + minutes + "m " + seconds + "s ");
    }
}
