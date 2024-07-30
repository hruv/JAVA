package com.company;

//import java.util.Scanner;                                (SCANNER)style1 : only import scanner from util package
//import java.util.*;                                      (*)style2 : import all from util package
public class java65 {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);                        style 1/2 helper
         java.util.Scanner sc = new java.util.Scanner(System.in);     //style 3
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
        String s=new java.lang.String("kame");                  //style4(usimg without importing package)
        System.out.println(s);
    }
}
