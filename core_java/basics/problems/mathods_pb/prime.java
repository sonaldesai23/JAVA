package core_java.basics.problems.mathods_pb;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        boolean ans =isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        // i = 2 boz, in prime no. are divisible by 1, so...
        /* 
        int i =2;
        while(i * i <= n) {
             if(n % i == 0) {
                return false;
            }
        }
        */
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
