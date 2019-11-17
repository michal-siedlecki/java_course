package com.siedlecki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCount = 1;
        int sum = 0;

        while (numberCount<=10){
            System.out.println("Enter number #"+numberCount+" : ");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int num = scanner.nextInt();
                sum += num;
                numberCount ++;
            } else {
                System.out.println("Invalid Input");
            }

            scanner.nextLine();
        }

        System.out.println("The sum is: " + sum);
        scanner.close();

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount<0)||(smallCount<0)||(goal<0)){
            return false;
        }

        if (bigCount==0){
            return (smallCount>=goal);
        } else if (smallCount==0){
            return (goal%5==0)&&(bigCount*5>=goal);
        }

        while((goal>=5)&&(bigCount>0)){
            goal -= 5;
            bigCount --;
        }

        return (goal<=smallCount);
    }

    public static int largestPrime(int number){
        if (number<=1){
            return -1;
        }

        for (int i = number; i > 0; i --){
            if (number%i==0){
                int factorDivisors = 0;
                for (int y = i; y > 1; y --){
                    if (i %y==0){
                        factorDivisors ++;
                    }
                }
                if (factorDivisors==1){
                    return i;
                }
            }
        }
        return number;
    }

    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
            return;
        }

        int spacesOutside = 0;
        int spacesInside = (number-4);

        for (int i = number; i>0; i--){
            System.out.print("*");
        }
        System.out.println();

        for (int row=1; row<(number/2); row++){

            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = spacesInside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }

            spacesInside -= 2;
            spacesOutside ++;
            System.out.print("*");
            System.out.println();
        }

        if (number%2!=0){
            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }



        for (int row=1; row<(number/2); row++){

            spacesInside += 2;
            spacesOutside --;

            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = spacesInside; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = spacesOutside; i>0; i--){
                System.out.print(" ");
            }


            System.out.print("*");
            System.out.println();

        }

        for (int i = number; i>0; i--){
            System.out.print("*");
        }
    }


}
