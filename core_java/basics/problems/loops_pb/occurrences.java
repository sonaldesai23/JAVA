package core_java.basics.problems.loops_pb;
import java.util.Scanner;

public class occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. sequence - ");
        int n = sc.nextInt(); //np. sequence
        System.out.println("Enter no. of which occurence is to find - ");
        int num = sc.nextInt();//occurences to find of
        int cnt = 0;

        while(n>0)
        {
            int rem = n%10; //gives last digit as remainder.
            if(rem == num) {
                cnt++;
            }
            n = n / 10;
        }
        System.out.println(num + " is occured " + cnt + " times.");

        sc.close();
    }

}
