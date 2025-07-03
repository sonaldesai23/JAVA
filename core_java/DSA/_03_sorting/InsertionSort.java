package core_java.DSA._03_sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] arr = {-1, -34, 5, 4,0, -78, 3, 2, 1};
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for(int i = 0; i< arr.length -2; i++) {
            for(int j = i + 1; j > 0; i--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
                
            }
        }
    }

    
    // for swapping
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
   
    //to find max index
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
