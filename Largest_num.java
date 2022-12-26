package com.bridzlabs;

import java.util.Scanner;

public class Largest_num {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input the first number: ");
            double x = scan.nextDouble();
            System.out.print("Input the Second number: ");
            double y = scan.nextDouble();
            System.out.print("Input the third number: ");
            double z = scan.nextDouble();
            System.out.print("The largest value is " + largest(x, y, z) + "\n");
        }

        public static double largest(double x, double y, double z) {
            return Math.max(Math.max(x, y), z);
        }
}