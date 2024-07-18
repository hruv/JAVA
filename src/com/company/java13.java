package com.company;
import java.util.Scanner;

public class java13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name1 = new String("Harry");

        String name2 = "Harry";

        char[] str = {'H', 'A', 'R', 'R', 'Y'};
        String s = new String(str);

        String s1 = in.next();

        String s2 = in.nextLine();

        System.out.println(name1 + name2 + s + s1 + s2);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);

    }
}

