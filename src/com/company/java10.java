package com.company;
import java.util.Scanner;
public class java10
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println( ++y *8);
        char ch = 'a';
        System.out.println(++ch);

    }
}

/*
In Java, here are the possible combinations of data types:

Primitive Types:

1. byte + byte = byte
2. short + short = short
3. int + int = int
4. long + long = long
5. float + float = float
6. double + double = double

Primitive + String:

1. byte + String = String
2. short + String = String
3. int + String = String
4. long + String = String
5. float + String = String
6. double + String = String

Primitive + Primitive (different types):

1. byte + short = int
2. byte + int = int
3. byte + long = long
4. byte + float = float
5. byte + double = double
6. short + int = int
7. short + long = long
8. short + float = float
9. short + double = double
10. int + long = long
11. int + float = float
12. int + double = double
13. long + float = float
14. long + double = double
15. float + double = double

Note: When combining different primitive types, Java performs automatic type promotion to ensure the accuracy of the result.

Reference Types (Objects):

1. String + String = String (using the + operator for concatenation)

Remember, when working with reference types (objects), the + operator is used for concatenation, not addition. For example, "Hello " + "World" results in "Hello World".

Keep in mind that this list is not exhaustive, and there are many other possible combinations and scenarios in Java.
 */
