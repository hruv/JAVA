package com.company;

public class java29 {
    public static void main(String[] args) {


        // Practice Problem 1
//        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum = 0;
//        for (float element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is " + sum);
//

        // Practice Problem 2
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 45.57f;
//        boolean isInArray = false;
//        for(float element:marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }


        // Practice Problem 3
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum/marks.length);
//


        // Practice Problem 4
//        int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13}, {3, 7, 1}};
//        int [][] result ={ {0, 0, 0}, {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++)
//        { // row number of times
//            for (int j=0;j<mat1[i].length;j++)
//            {
//               // System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print( result[i][j]+ "  ");
//            }
//            System.out.println();
//
//        }


//   Practice Problem 5
////     logic1
 //       ---------------------------------------------------------------------------------
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element: arr){
//            System.out.print(element + " ");
//        }
//
//
//        -----------------------------------------------------------------------------
////        logic2
//        for (int i = l-1; i >=0; i--) {
//            System.out.print(arr[i]+" ");
//        }


        // Practice Problem 6
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int max = 0;
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);
//
//        note:to make above code with negative values innitialize min/max with below functions
//        System.out.println(Integer.MIN_VALUE);------(-5485554543)
//        System.out.println(Integer.MAX_VALUE);------(+8773596595)



        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}

// Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }