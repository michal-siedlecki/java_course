package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(9,3));
        System.out.println(calcFeetAndInchesToCentimeters(9));
        System.out.println(calcFeetAndInchesToCentimeters(3,7));

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet <= 0)||(inches<=0 || inches >=12)){
            return -1;
        }
        inches += (feet*12);
        return inches*2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches<=0 || inches >=12){
            return -1;
        }
        return inches*2.54;
    }

}
