package com.anubhav;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your answer : ");
//        int a = input.nextInt();
        String name = input.nextLine();
        System.out.println("Your name is : " + name);
    }
}
