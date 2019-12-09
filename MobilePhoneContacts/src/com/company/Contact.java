package com.company;

public class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getFullContact(){
        return (this.name + " : " + this.number);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
