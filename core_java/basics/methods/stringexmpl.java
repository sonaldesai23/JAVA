package core_java.basics.methods;

import java.util.Arrays;

public class stringexmpl {
    public static void main(String[] args)  {
        String msg = greet();
        System.out.println(msg);

        int num = swap(4,6);
        System.out.println(num);

        int[] arr = { 3,5,5,68,9};
        changevalue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static String greet() {
        String greeting = "how are you?";
        return greeting;
    }

    static int swap(int a , int  b) {
        int temp = a;
        a = b;
        b = temp;
        return(a);
    }

    static void changevalue(int[] nums) {
        nums[0] = 99;
    }
}
