package com.anubhav;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,3,54,7,7);
        test(4,2,"Anubhav", "Tyagi", "Test function");

    }
    static void test(int a, int b, String ...v)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
