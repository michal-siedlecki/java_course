package com.siedlecki;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printArray(sort(inputArray()));


    }

    public static int[] sort(int[] arrayToSort){
        boolean notSorted=true;
        int temp;
        while (notSorted){
            notSorted = false;
            for (int i=0; i<arrayToSort.length-1; i++){
                if(arrayToSort[i]>arrayToSort[i+1]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = temp;
                    notSorted = true;
                }
            }
        }
        return arrayToSort;
    }

    public static void printArray(int [] array){
        System.out.println();
        System.out.println("Your sorted array is:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] inputArray(){

        System.out.println("how long the array has to be?");
        System.out.println();
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i=0; i<array.length; i++){
            System.out.println();
            System.out.println("Please input element:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
