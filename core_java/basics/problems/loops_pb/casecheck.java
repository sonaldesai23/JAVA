package core_java.basics.problems.loops_pb;
import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().trim().charAt(2);
        //.trim() removes extra spaces before and after a word.
        
        if (a >='a' && a <='z') {
            System.out.println(a + " is lowercase");
        } else {
            System.out.println(a + " is uppercase");
        }
        
    
    }

    
}
