package com.siedlecki;

public class Password {
    private static final int key = 342678;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public boolean checkPassword(int password){
        if (encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Acces granted!");
            return true;
        } else {
            System.out.println("Access permitted!");
            return false;
        }
    }
}
