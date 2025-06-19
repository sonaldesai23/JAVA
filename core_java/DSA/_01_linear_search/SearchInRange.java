package core_java.DSA._01_linear_search;

public class SearchInRange {
    public static void main(String[] args) {
	    int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 140;
        System.out.println(linearSearch2(arr, target, 1, 4));
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            
            int ele = arr[index];
            if (ele == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    } 
}
