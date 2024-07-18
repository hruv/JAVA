package com.company;
import java.util.Scanner;
public class java6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        System.out.println("enter your marks in maths1");
        int a=in.nextInt();
        System.out.println("enter your marks in maths2");
        int b=in.nextInt();
        System.out.println("enter your marks in maths3");
        int c=in.nextInt();
        System.out.println("enter your marks in maths4");
        int d=in.nextInt();
        System.out.println("enter your marks in maths5");
        int e=in.nextInt();

        float p=(a+b+c+d+e)/5;//will give int result (will study this thing later)

        System.out.println("the percanrtage= "+p+"%");
    }
}
