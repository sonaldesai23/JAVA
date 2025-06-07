package core_java.basics.problems.loops_pb;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while(n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
        sc.close();

    }
}
