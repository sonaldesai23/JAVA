package core_java.DSA._02_binary_search.Interview_Prep_que;
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);

    }

    //return the index greatest number <= target.
    static int floor(int[] arr, int target)  {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            //find middle ele.
            //in below case, it might be possible that (s + e) might exceed the size of int.
            // int mid = (start + end) / 2;
            
            int mid = start + (end - start) / 2;
            if( target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

}
