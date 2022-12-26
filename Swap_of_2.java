package com.bridzlabs;

public class Swap_of_2 {
    public static void main(String[] args) {
        int a =5;
        int b =6;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}