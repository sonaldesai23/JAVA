package core_java.basics.problems.loops_pb;
import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter the values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a>c){
            System.out.println("a  is Largest.");
        }
        else if(b > a && b > c) {
             System.out.println("b  is Largest.");
        } else {
             System.out.println("c  is Largest.");
        }

        sc.close();

    }
    
}
