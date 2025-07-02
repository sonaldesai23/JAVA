package core_java.DSA._03_sorting.Insertion_sort;

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

    static void selection(int[] arr) {
        for(int i= 0; i < arr.length; i++) {
            //find the max item in the remaining arr nad  swap with correct index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
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
