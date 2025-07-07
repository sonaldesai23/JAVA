package core_java.DSA._03_sorting.InterviewProblems;
// https://leetcode.com/problems/find-the-duplicate-number/description/?__cf_chl_tk=4DZo8pY8be5MyP5Ex0WW_Ml9Imt2k8UmlRmeqbivqGM-1751629744-1.0.1.1-VTVk5LRvTr9WgozidKC7WB1Atb5up81ksOXXmQxWzaM
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new FindAllDuplicate().findDuplicates(nums);
        System.out.println(ans);
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
 