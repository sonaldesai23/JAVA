package core_java.DSA._02_binary_search.Interview_Prep_que;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = nextGreatestLetter(arr, target);
        System.out.println(ans);

    }


    
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length -1;

        while(start <= end) {
            //find middle ele.
            //in below case, it might be possible that (s + e) might exceed the size of int.
            // int mid = (start + end) / 2;
            
            int mid = start + (end - start) / 2;
            if( target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return letters[start % letters.length];
    }
}
