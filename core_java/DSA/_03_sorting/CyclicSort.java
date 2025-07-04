package core_java.DSA._03_sorting;

import java.util.Arrays;

// Only for 1 to N values (positive integers in valid range)
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4}; // 0 is invalid for 1-N cyclic sort
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Check before using arr[i] - 1
            if (arr[i] > 0 && arr[i] <= arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            } else {
                i++; // skip 0 or out-of-range elements
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
