package com.bridzlabs;

import java.util.Scanner;

public class Harmonic_Num {
    public static void main(String[] args) {
        double result = 0, num = 0, j;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the harmonic you want to find: ");
        n = scan.nextInt();
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);
    }
}
