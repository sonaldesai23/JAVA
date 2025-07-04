package core_java.DSA._03_sorting.InterviewProblems;
import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/missing-number/submissions/1685206924/?__cf_chl_tk=4DZo8pY8be5MyP5Ex0WW_Ml9Imt2k8UmlRmeqbivqGM-1751629744-1.0.1.1-VTVk5LRvTr9WgozidKC7WB1Atb5up81ksOXXmQxWzaM

public class DisappearedNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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

        //just find missing numbers.
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
