package com.anubhav;

public class Shadowing {
    static int x = 5;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 3;
        System.out.println(x);
    }
}
