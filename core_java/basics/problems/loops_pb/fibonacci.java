package core_java.basics.problems.loops_pb;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;  //previous
        int b = 1; //current index
        int count = 2;

        while(count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(b);
        }
        sc.close();
    }
}
