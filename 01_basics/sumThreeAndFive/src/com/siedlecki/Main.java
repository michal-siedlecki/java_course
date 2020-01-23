package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        System.out.println();


    }

    public static int sumDigits(int number) {
        if ((number < 10) || (number > 999)) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return (sum);
    }

    public static boolean isPalindrome(int input) {
        int number = input;
        int lastDigit = 0;
        int reverse = 0;
        if (input > 0) {
            while (number > 0) {
                lastDigit += number % 10;
                number /= 10;
                reverse *= 10;
                reverse += lastDigit;
                lastDigit = 0;
            }


        } else if (input < 0) {
            while (number < 0) {
                lastDigit += number % 10;
                number /= 10;
                reverse *= 10;
                reverse += lastDigit;
                lastDigit = 0;
            }

        }
        return ((reverse == input) || (-reverse == input));

    }

    public static int sumFirstAndLastDigit (int number){
        if (number<0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number%10;
        if (number<10){
            return lastDigit*2;
        }

        while(number>=10){
            firstDigit = number/10;
            number /= 10;
        }

        return (firstDigit+lastDigit);
    }

    public static int sumEvenDigits(int number){
        if (number<0){
            return -1;
        }
        int digit;
        int sum = 0;
        while (number>0){
            digit = number%10;
            number /= 10;
            if (digit%2==0){
                sum += digit;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigit(int numOne, int numTwo){
        if((numOne<10)||(numOne>99)||(numTwo<10)||(numTwo>99)){
            return false;
        }
        int firstOne = numOne%10;
        int secondOne = numOne/10;
        int firstTwo = numTwo%10;
        int secondTwo = numTwo/10;
        return ((firstOne==firstTwo)||(firstOne==secondTwo)||(secondOne==firstTwo)||(secondOne==secondTwo));
    }

    public static boolean isValid(int number){
        return ((number>=10)&&(number<=1000));
    }

    public static boolean hasSameLastDigit(int first, int second, int third){
        if(isValid(first) && isValid(second) && isValid(third)){
            int one = first%10;
            int two = second%10;
            int three = third%10;
            return (one==two)||(one==three)||(two==three);
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if ((first<10)||(second<10)) {
            return -1;
        }

        if (first%second==0){
            return second;
        } else if (second%first==0){
            return first;
        }

        if(second>first){
            for (int i=second; i>1;i--){
                if ((first%i==0)&&(second%i==0)){
                    return i;
                }
            }
        } else {
            for (int i = first; i > 1; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        }
        return first;
    }

    public static void printFactors(int number){
        if (number<1){
            System.out.println("Invalid Value");
        }

        for (int i=1; i<=number; i++){
            if (number%i==0){
                System.out.println(i);

            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        return (sum==number);
    }
    
    public static int getDigitCount(int number){
        if (number<0){
            return -1;
        }
        int sum=1;
        while(number>=10){
            number/=10;
            sum ++;
        }
        return sum;
    }

    public static int reverse(int number){
        boolean isPositive = true;
        if (number<0){
            isPositive = false;
            number = -number;
        }

        int reverse = 0;
        while (number>10){
            reverse *= 10;
            reverse +=number%10;
            number /= 10;
        }
        if (number==10){
            reverse *= 100;
            reverse += 1;
        } else {
            reverse *= 10;
            reverse += number;
        }
        if (!isPositive){
            return -reverse;
        }
        return reverse;
    }

    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        if (number==0){
            System.out.println("Zero");
        }
        int reversedNumber = reverse(number);
        int zeros = getDigitCount(number)-getDigitCount(reversedNumber);
        while (reversedNumber>0){

            switch (reversedNumber%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNumber /=10;
        }
        for (int i = zeros; i>0; i--){
            System.out.println("Zero");
        }
    }
}
