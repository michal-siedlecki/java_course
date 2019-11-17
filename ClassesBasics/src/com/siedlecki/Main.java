package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(23);
        person.setFirstName("Michel");
        person.setLastName("Moran");

        System.out.println((person.getFirstName()));
        System.out.println((person.getFullName()));
        System.out.println((person.getAge()));

    }
}
