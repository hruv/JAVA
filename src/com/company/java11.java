package com.company;
import java.util.Scanner;

public class java11
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();


        float percentage = (float)(physics + English + chemistry + mathematics + computer)/5;
        float percentage1 =(physics + English + chemistry + mathematics + computer)/5;
        float percentage2 =(physics + English + chemistry + mathematics + computer)/5f;
        //float percentage3 =((physics + English + chemistry + mathematics + computer)f)/5;



        System.out.println("percentage : ");
        System.out.println(percentage);

        System.out.println("percentage1 : ");
        System.out.println(percentage1);

    }
}
