package com.anubhav;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int ans = Math.max(a, b);
        ans = Math.max(ans, c);
        System.out.println(ans);

    }
}
