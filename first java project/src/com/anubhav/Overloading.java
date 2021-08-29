package com.anubhav;

public class Overloading {
    public static void main(String[] args) {
        sum(2, 3);
        sum(2,4,5,6);
    }
    static void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    static void sum(int ...v)
    {
        int s = 0;
        for (int j : v) {
            s += j;
        }
        System.out.println(s);
    }
}
