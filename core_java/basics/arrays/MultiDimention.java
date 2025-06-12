package core_java.basics.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
       
        // int[][] arr = new int[3][3];

        // int[][] arr1 = {
        //         {1, 2, 3},   //0th index
        //         {4, 5},      //1st index
        //         {6, 7, 8, 9} //2nd index -> arr1[2] = {6, 7, 8, 9}
        //                      //             arr1[2][0] = {6}
        // };

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // System.out.println(arr.length); //gives no. of rows
        
        //Input -
        for(int row = 0; row <arr.length; row++) {
            //for each col in every row
            for(int col = 0; col <arr[row].length; col ++) { 
                //bcoz, every col is of different length.
                arr[row][col] = sc.nextInt();
            }
        }

        //Output -
        //  for(int row = 0; row <arr.length; row++) {
        //     //for each col in every row
        //     for(int col = 0; col <arr[row].length; col++) { 
        //        System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int row = 0; row <arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for ( int[] a : arr) {
            // Dtype of every ele itslef is an array.
            System.out.println(Arrays.toString(a));
        }
        /*
        o/p- 
        [1, 2, 3]
        [4, 5, 6]
        [7, 8, 9]

         */
    
    }
}
