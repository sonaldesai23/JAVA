package core_java.DSA._02_binary_search.Interview_Prep_que;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPos {
    public static void main(String[] args)  {
        
    }
    
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for 1st occurrence if target first.
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end; 

        return ans;
    }

    //this functions will just returns the index value of target.
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            //find middle ele.
            //in below case, it might be possible that (s + e) might exceed the size of int.
            // int mid = (start + end) / 2;
            
            int mid = start + (end - start) / 2;
            if( target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid] ) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if(findStartIndex == true) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    } 
}
