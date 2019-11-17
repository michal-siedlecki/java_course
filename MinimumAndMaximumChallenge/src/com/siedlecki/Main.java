package com.siedlecki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int maximum = 0;
        boolean isFirstInt = scanner.hasNextInt();
        int minimum = scanner.nextInt();

        if (isFirstInt) {
            maximum = minimum;
            while (true) {
                System.out.println("Enter number: ");
                boolean isInt = scanner.hasNextInt();
                if (isInt) {
                    int actual = scanner.nextInt();

                    if (actual > maximum) {
                        maximum = actual;
                    }
                    if (actual < minimum) {
                        minimum = actual;
                    }
                } else {
                    break;
                }
                scanner.nextLine();
            }
        }
        System.out.println("Your maximum number so far is: " + maximum);
        System.out.println("Your minimum number so far is: " + minimum);
        scanner.close();
    }
}

