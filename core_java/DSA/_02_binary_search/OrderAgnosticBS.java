package core_java.DSA._02_binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int[] arr = {45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 0;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

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
