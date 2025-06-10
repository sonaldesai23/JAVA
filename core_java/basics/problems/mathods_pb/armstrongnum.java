package core_java.basics.problems.mathods_pb;
import java.util.Scanner;
/*
    If a = 153 
       1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153  
       Then its a armstrong no.
 */
public class armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        boolean ans = isArmstrong(num);
        System.out.println(ans);

        // Print all 3 digit armstrong number.
        System.out.println("All 3 digit armstrong numbers - ");
        for(int i = 100; i <= 1000; i++) {
            if(isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }

    }
    

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }

        if(sum == original) {
            return true;
        }
        return false;
    }

}
