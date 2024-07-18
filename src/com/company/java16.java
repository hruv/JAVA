package com.company;

import java.util.Scanner;
public class java16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no.");
        int a = in.nextInt();

        if (a == 1) {
            System.out.println("1");
        } else if (a == 2) {
            System.out.println("2");
        } else if (a == 3) {
            System.out.println("3");
        } else {
            System.out.println("nikal");
        }
    }
}
