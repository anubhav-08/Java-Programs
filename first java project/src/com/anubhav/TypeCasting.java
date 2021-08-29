package com.anubhav;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextInt();
        System.out.println(a);
        int b = (int)input.nextFloat();
        System.out.println(b);
    }
}
