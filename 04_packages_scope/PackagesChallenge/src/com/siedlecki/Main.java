package com.siedlecki;


import com.series.golden.Series;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Series series = new Series();
        System.out.println("Series nSum");
        for (int i=0; i<=10; i++){
            System.out.println(series.nSum(i));
        }
        System.out.println("\n Series factorial");
        for (int i=0; i<=10; i++){
            System.out.println(series.factorial(i));
        }

        System.out.println("\n Series fibonacci");
        for (int i=0; i<=10; i++){
            System.out.println(series.fibonacci(i));
        }

    }
}
