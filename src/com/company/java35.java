package com.company;
import java.util.Scanner;
class java35 {


    static void prob1(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    static void prob2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int prob3(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + prob3(n - 1);
    }


    static void prob4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int prob5(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return prob5(n - 1) + prob5(n - 2);
        }
    }


    public static float prob6(int... arr) {
        int sum = 0;
        int n = arr.length;
        for (int e : arr) {
            sum = sum + e;
        }
        float a = (float) sum / n;
        return a;
    }

    public static void prob9(int c) {
        float a = 32.0f + (9 * c) / 5f;
        System.out.println(a);
    }

    static int prob10(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int p1=in.nextInt();
//        int p2=in.nextInt();
//        int p3=in.nextInt();
//        int p4=in.nextInt();
//        int p5=in.nextInt();
//--------------------------------------------------------
//        int p66=in.nextInt();
//        int[] p6=new int[p66];
//        for (int i = 0; i <p66 ; i++) {
//            p6[i]=in.nextInt();
//        }
//---------------------------------------------------------
//        prob7--later
//        prob8--later
//        int p9 = in.nextInt();
//        int p10=in.nextInt();


//        prob1(p1);
//        prob2(p2);
//        System.out.println(prob3(p3));
//        prob4(p4);
//        System.out.println(prob5(p5));
//        System.out.println(prob6(p6));
//        prob7--later
//        prob8--later
//        prob9(p9);
//        System.out.println(prob10(p10));
    }
}

