package core_java.basics;
import java.util.Scanner; //import java.util.*;

public class ipop{
    public static void main(String[] args) {
        System.out.println("Taking input from the user.");    //sout- shiortform
        Scanner sc = new Scanner(System.in); //Read input from keyboard.
        System.out.println("Enter num 1: ");
        int a = sc.nextInt();  
        System.out.println("Enter num 2: ");
        int b = sc.nextInt(); 
        int sum = a + b;
        System.out.println("Sum of two numbers is: " +sum);
        System.out.println(sum);
        sc.close();
    }

}


