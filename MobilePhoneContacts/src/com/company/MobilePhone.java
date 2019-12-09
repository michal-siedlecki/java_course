package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    public boolean quit = false;
    private Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.quit = false;
        this.contacts.add(new Contact("default", 0));
    }

    public void printMenu(){
        System.out.println("\n1. List of contacts\n" +
                "2. add contact\n" +
                "3. search for a contact\n" +
                "4. update contact\n" +
                "5. remove contact\n" +
                "6. quit");
    }

    public void chooseMenu(){
        System.out.println("Choose option form menu:");
        System.out.println();
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option){
            case 1:
                this.printContacts();
                break;
            case 2:
                this.addContact();
                break;
            case 3:
                this.searchContact();
                break;
            case 4:
                this.updateContact();
                break;
            case 5:
                this.removeContact();
                break;
            case 6:
                this.quit=true;
                break;
        }
    }



    private void printContacts() {
        for(int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i).getFullContact());
        }
    }

    private void addContact(){
        System.out.println("enter number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (!this.hasNumber(number)){
            this.createContact(number);
        } else {
            System.out.println("the number already exists in Your contacts");
        }
    }

    private void createContact(int number) {
        System.out.println("Please enter name for this contact: ");
        String name = scanner.nextLine();
        this.contacts.add(new Contact(name, number));
    }

    private boolean hasNumber(int number) {
        for (int i=0; i<contacts.size(); i++){
            if (this.contacts.get(i).getNumber()==number){
                return true;
            }
        }
        return false;
    }

    private boolean hasName(String name) {
        for (int i=0; i<contacts.size(); i++){
            if (this.contacts.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    private void searchContact() {
        System.out.println("please enter the name :");
        String name = scanner.nextLine();
        if (this.hasName(name)){
            System.out.println(this.getContact(name).getFullContact());
        }
    }

    private Contact getContact(String name) {
        for (int i=0; i<this.contacts.size(); i++){
            if (this.contacts.get(i).getName().equals(name)){
                return this.contacts.get(i);
            }
        }
        return null;
    }

    private void updateContact() {
        System.out.println("please enter the name :");
        String name = scanner.nextLine();
        if (this.hasName(name)) {
            Contact contact = this.getContact(name);
            System.out.println(contact.getFullContact());
            System.out.println("what do You want to change?\n" +
                    "1. name\n" +
                    "2. number\n");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1:
                    this.updateName(contact);
                    break;
                case 2:
                    this.updateNumber(contact);
                    break;

                default:
                    System.out.println("option not avilable");
                    break;
            }
        }
    }

    private void updateName(Contact contact) {
        System.out.println("enter new name: ");
        String newName = scanner.nextLine();
        contact.setName(newName);
        System.out.println("contact updated");
        System.out.println(contact.getFullContact());
    }

    private void updateNumber(Contact contact) {
        System.out.println("enter new number: ");
        int newNum = scanner.nextInt();
        contact.setNumber(newNum);
        System.out.println("contact updated");
        System.out.println(contact.getFullContact());
    }


    private void removeContact() {
        System.out.println("please enter the name :");
        String name = scanner.nextLine();
        if (this.hasName(name)){
            System.out.println(this.getContact(name).getFullContact());
            System.out.println("do You want to delete it? (y/n)");
            String choise = scanner.nextLine();
            switch (choise){
                case "y":
                    this.contacts.remove(this.getContact(name));
                    System.out.println("contact deleted");
                    break;
                case "n":
                    this.printMenu();
                    System.out.println("canceled");
                    break;

            }
        } else {
            System.out.println("there is no contact with this name");
        }


    }

}
