package com.siedlecki;

public class Main {

    public static void main(String[] args) {
	int count = 0;
	for (int i=12_900_000; i<200000_000; i++){
	    if (isPrime(i)){
	        count++;
            System.out.println("Prime number " + count + ". is " + i);

            if (count==2){
                System.out.println("and the secret password is: ");
                break;
            }
        }
    }

    }
    public static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for (int i=2; i<= num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
