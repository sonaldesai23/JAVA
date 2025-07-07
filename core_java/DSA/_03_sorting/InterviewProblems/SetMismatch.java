package core_java.DSA._03_sorting.InterviewProblems;
// https://leetcode.com/problems/set-mismatch/description/?__cf_chl_tk=4DZo8pY8be5MyP5Ex0WW_Ml9Imt2k8UmlRmeqbivqGM-1751629744-1.0.1.1-VTVk5LRvTr9WgozidKC7WB1Atb5up81ksOXXmQxWzaM

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Check before using nums[i] - 1
            if (nums[i] > 0 && nums[i] <= nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            } else {
                i++; // skip 0 or out-of-range elements
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
        }
        return  new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
