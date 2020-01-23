package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value :" + myMinFloatValue);
        System.out.println("float max value :" + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value :" + myMinDoubleValue);
        System.out.println("double max value :" + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloat : " + myFloatValue);
        System.out.println("MyDouble : " + myDoubleValue);

        double poundToKiloRatio = 0.45359237;
        int myPounds = 15;
        double myKilo = (myPounds*poundToKiloRatio);

        System.out.println("Your " + myPounds + " pounds is equal to "
                + myKilo + " kg");

    }
}
