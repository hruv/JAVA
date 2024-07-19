package com.company;

public class java24
{
    public static void main(String[] args)
    {
        // Break and continue using loops!
//        for (int i=0;i<50;i++)
//        {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        while(i<5);
//        System.out.println("Loop ends here");
//            for(int i=0;i<50;i++){
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("Java is great");
//        }
        int i=0;
        do{
            i++;
            if(i==2)
            {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }
        while(i<5);
        System.out.println("Loop ends here");
    }
}


/*


for(int i=7;i>0;i--)
{
        if(i==3)
        {
            continue;//continue skips the rest statement
         }
 }
output:
7
6
5
4
2
1

 */