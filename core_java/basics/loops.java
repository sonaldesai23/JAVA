package core_java.basics;
import java.util.Scanner;
public class loops { 
    public static void main(String[] args){
        
        /*
        for loop Synatx-
            for(initialixation; condition; inc/dec){
                //body
            }
        */

        //Q : Print no. from 1-5
        // for (int num1 = 1; num1 <= 5; num1 += 1){
        //     System.out.println(num1);

        //Print no. from 1-n
        System.out.println("FOR LOOP:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. - ");
        int n = sc.nextInt();

        for (int num = 1; num<=n; num++){
            System.out.println(num + " ");
        }

        /*
        while loops
            while(condition) {
                //body
            }
        */
        System.out.println("WHILE LOOP");
        int n1 = 1 ;
        while(n1 <= 5){
            System.out.println(n1);
            n1 += 1;
        }

        /*
        do-while loop
            do{
                //body
            } while (condition)
        */
        System.out.println("DO-WHILE LOOP");
        int n2 = 1;
        do {
            System.out.println(n2);
            n2 ++;
        } while(n2 <= 5);
    }
}

