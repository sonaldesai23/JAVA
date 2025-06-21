package core_java.DSA._01_linear_search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896};
        System.out.println(findnum(nums));

        System.out.println(digits(4534));
    }

    static int findnum(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    // function tp check whether a number contains even digits or not.
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
        // retrun numberOfDigits % 2 == 0; //shortcut
    }

    static int digits(int num) {
        int count =0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
