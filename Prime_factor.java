package com.bridzlabs;

import java.util.Scanner;

public class Prime_factor {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        // input data
        System.out.print("Enter a Number : ");
        n = scan.nextInt();
        System.out.print("The Prime Factors of " + n + " are : ");

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else
                i++;
        }
        System.out.println(" ");
    }
}
