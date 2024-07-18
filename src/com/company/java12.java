package com.company;
import java.util.Scanner;

public class java12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        System.out.println(b>8);

        System.out.println(7*49/7+35/7);

        /*
        1*4
        4
         */
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

//        Write the following expression in a java program:
//        (v^2-u^2)/2as
//      (v*v-u*u)/2*a*s

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}

