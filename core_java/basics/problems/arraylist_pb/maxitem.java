package core_java.basics.problems.arraylist_pb;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        
        System.out.println(maxRange(arr, 0, 4));
    }
    
    //assumming arr is not empty.
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal =arr[0];
        for(int i = 1; i< arr.length; i++) {
            if( arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    //finding max in a particular range
    static int maxRange(int[] arr, int start, int end) {
        // work on edge cases here, like arr being null.
        if (end>start) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }

        int maxVal =arr[start];
        for(int i = start; i< end; i++) {
            if( arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
