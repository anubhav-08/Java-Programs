package com.anubhav;

public class Swap {
    public static void main(String[] args) {
        int a = 4, b = 5;
        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
