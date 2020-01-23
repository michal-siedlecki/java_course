package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.5,1.5,2));
        System.out.println(getBucketCount(-3.4,2.5,1.5,2));
        System.out.println(getBucketCount(2.25,3.55,2.5,1));
        System.out.println(getBucketCount(3.4,2.5,1.5));
        System.out.println(getBucketCount(3.4,1.5));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if ((width<=0)||(height<=0)||(areaPerBucket<=0)||(extraBucket<0)){
            return -1;
        }
        double area = width*height;
        int bucketsNeeded = (int) Math.ceil((area/areaPerBucket));
        return (bucketsNeeded-extraBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width<=0)||(height<=0)||(areaPerBucket<=0)){
            return -1;
        }
        double area = width*height;
        int bucketsNeeded = (int) Math.ceil((area/areaPerBucket));
        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if ((area<=0)||(areaPerBucket<=0)){
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((area/areaPerBucket));
        return (bucketsNeeded);

    }

}
