package core_java.DSA._01_linear_search;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr  = {
            {23,5,4},
            {23, 59, 66, 45},
            {23, 5, 33, 54},
            {34, 78}
        };
        int target = 5;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }

    static int[] search(int[][] arr, int target) {
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target) {
                    return new int[]{r,c};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for(int[] ints : arr) {
            for( int ele : ints) {
                if(ele > max) {
                max = ele;
                }
            }
        }
        return max;
    }
}
 