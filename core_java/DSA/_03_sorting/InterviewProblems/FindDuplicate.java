package core_java.DSA._03_sorting.InterviewProblems;
// https://leetcode.com/problems/find-the-duplicate-number/?__cf_chl_tk=4DZo8pY8be5MyP5Ex0WW_Ml9Imt2k8UmlRmeqbivqGM-1751629744-1.0.1.1-VTVk5LRvTr9WgozidKC7WB1Atb5up81ksOXXmQxWzaM

public class FindDuplicate {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
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
