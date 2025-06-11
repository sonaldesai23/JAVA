package core_java.basics.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; 
        arr[0] = 21;
        arr[1] = 26;
        arr[2] = 664;
        arr[3] = 873;
        arr[4] = 97;


        //input using for loop
        System.out.println("Enter Arr elemnts - ");
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for(int num : arr) { //for every element in arr, print the element
        //     System.out.println(num + " "); // here num represents elements of the array.
        // }

        // System.out.println("\n"+arr[5]);

        //Array of Objects
        String[] str = new String[4];
        for( int j =0; j < str.length; j++ ) {
            str[j] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "Sonal";
        str[2] = "Desai";
        System.out.println(Arrays.toString(str));

    }
}
