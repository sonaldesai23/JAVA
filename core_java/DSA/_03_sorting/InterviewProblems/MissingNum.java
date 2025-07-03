package core_java.DSA._03_sorting.InterviewProblems;
// https://leetcode.com/problems/missing-number/
// Amazon Que.
public class MissingNum {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        // missingNumber(nums);
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // search for first  missing number.
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }

        // case 2
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
