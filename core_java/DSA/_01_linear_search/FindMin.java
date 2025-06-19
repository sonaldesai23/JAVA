package core_java.DSA._01_linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, -23, -10, 43, 14, 28};
        System.out.println("Min is : " + solution(arr));
    }

    static int solution(int[] arr)  {
        if (arr.length == 0) {
            return -1;
        }
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i] ;
            }
        }
        return ans;
    }
}
