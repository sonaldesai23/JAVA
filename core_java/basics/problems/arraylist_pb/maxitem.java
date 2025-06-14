package core_java.basics.problems.arraylist_pb;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        
        System.out.println(max(arr, 0, 4));
    }
    
    //assumming arr is not empty.
    static int max(int[] arr) {
        int maxVal =arr[0];
        for(int i = 1; i< arr.length; i++) {
            if( arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    //finding max in a particular range
    static int max(int[] arr, int start, int end) {
        int maxVal =arr[start];
        for(int i = start; i< end; i++) {
            if( arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
