package com.anubhav;

import java.util.Scanner;

public class Functions {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For square enter 1 or for rectangle enter 2 : ");
        int n = in.nextInt();
        switch (n)
        {
            case 1->{
                System.out.println("Enter length of square : ");
                int a = in.nextInt();
                int ans = area(a);
                System.out.println("Area of square is : " +  ans);
            }
            case 2->{
                System.out.println("Enter length of rectangle : ");
                int l = in.nextInt();
                System.out.println("Enter width of rectangle : ");
                int w = in.nextInt();
                int ans = area(l, w);
                System.out.println("Area of rectangle is : " + ans);
            }
            default -> System.out.println("Enter valid selection");
        }
    }
    static int area(int a)
    {
        return a*a;
    }
    static int area(int a, int b)
    {
        return a*b;
    }
}
