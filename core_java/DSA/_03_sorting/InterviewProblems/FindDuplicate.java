package core_java.DSA._03_sorting.InterviewProblems;
// https://leetcode.com/problems/find-the-duplicate-number/?__cf_chl_tk=4DZo8pY8be5MyP5Ex0WW_Ml9Imt2k8UmlRmeqbivqGM-1751629744-1.0.1.1-VTVk5LRvTr9WgozidKC7WB1Atb5up81ksOXXmQxWzaM

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if(nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
