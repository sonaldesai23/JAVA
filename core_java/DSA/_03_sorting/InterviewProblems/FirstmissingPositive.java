package core_java.DSA._03_sorting.InterviewProblems;
// Leetcode 41 - First Missing Positive
public class FirstmissingPositive {
    public static void main(String[] args){
        int[] nums = {3, 4, -1, 1};
        int ans = firstmissingPositive(nums);
        System.out.println((ans));
    }
    public static int firstmissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // search for first  missing number.
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
