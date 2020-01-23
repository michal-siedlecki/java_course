package com.siedlecki;


import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileWriter divResults = null;
        try {
            divResults = new FileWriter("results.txt");
            divResults.write(String.format("my name is michal and the result is %s", GreatestCommonDivisor(1256,512)));
            divResults.close();
        } catch (IOException e) {
            System.out.println("exception catched");
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(GreatestCommonDivisor(89,55));

	// write your code here
    }
    public static int divide(int x, int y) {
        try {
            return x/y;

        } catch (Exception e){
            return 0;
        }
    }

    public static int GreatestCommonDivisor(int numA, int numB) {
        System.out.print(" ("+numA);
        System.out.print(",");
        System.out.print(numB+")");
        if ((numB == 0) || (numA == 0)) {
            return numA+numB;
        } else if (numA>numB){
            return GreatestCommonDivisor(numB,numA-numB);
        } else if (numA<numB){
            return GreatestCommonDivisor(numA, numB-numA);
        } else {
            return numA;
        }
    }
}
