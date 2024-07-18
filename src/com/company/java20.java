package com.company;

import java.util.Scanner;
import java.util.Random;

public class java20
{
    public static void main(String[] args)
    {
        //rock paper scissor
        //1    2     3
        Scanner in=new Scanner(System.in );
        Random on=new Random();
        int a= in.nextInt();
        int r= on.nextInt(1,4);
        System.out.println(r);
        if(r==1) {
            if (a == 1) {
                System.out.println("tie");
            } else if (a == 2) {
                System.out.println("comp loose");
            } else
                System.out.println("comp win");
        }
        else if(r==2) {
            if (a == 2) {
                System.out.println("tie");
            } else if (a == 3) {
                System.out.println("comp loose");
            } else
                System.out.println("comp win");
        }
        else {
            if (a == 3) {
                System.out.println("tie");
            } else if (a == 1) {
                System.out.println("comp loose");
            } else
                System.out.println("comp win");
        }
        }

    }


