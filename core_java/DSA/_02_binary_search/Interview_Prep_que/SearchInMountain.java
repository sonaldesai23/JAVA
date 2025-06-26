package core_java.DSA._02_binary_search.Interview_Prep_que;

// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args)    {
        
    }

    int search(int[] arr,int target ) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = oabs(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        } 
        // try to search in 2nd half.
        return oabs(arr, target, peak+1, arr.length-1);
    }


    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if( arr[mid] > arr[mid + 1]) {
                // u are in decreasing part of array
                // this may be the answer, but look at left
                // this is why end != mid -1;
                end = mid;
            } else {
                //in ascending part of array.
                start =  mid + 1;
                // bcoz, we know that mid+1 ele > mid ele.
            }
        }
        //in the end, start==end and pointing to the largest number bcoz of this 2 check above.
        //start and end are always trying to find max ele in the above 2 checks
        // hence, when they are pointing to just one ele, that is the max one , bcoz that is what the checks say.
        // more elaboration at every point of time for start and end, they have the best posssible ans til that time
        // and if we are saying 1 item is remaining, hence, cuz of above line that is the best possible ans.
        return start; //or return end as both are equal.
    }

    static int oabs(int[] arr, int target, int start, int end) {

        //fint whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];
        /*
        if(arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }  */


        while(start <= end) {
            //find middle ele.
            //in below case, it might be possible that (s + e) might exceed the size of int.
            // int mid = (start + end) / 2;
            
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if( target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if( target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }


}
