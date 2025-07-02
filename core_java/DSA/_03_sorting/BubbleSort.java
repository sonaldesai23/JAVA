package core_java.DSA._03_sorting.Bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, -34, 5, 4,0, -78, 3, 2, 1};
        // int[] arr = {3, 15, 29, 11, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times.
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step,max item will come at the last respective index.
            for(int j = 1; j < arr.length - i; j++) {
                
                //swap the item that is smaller than the previous item.
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u didnt swap for a partivular value of i, means arr is sorted,hence stop program.
            if(!swapped){
                // !false = true
                break;
            }
        }
    }
}
