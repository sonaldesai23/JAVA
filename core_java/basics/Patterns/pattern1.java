package core_java.basics.Patterns;

public class pattern1 {
    public static void main(String[] aegs) {
        ptrn1(4);
    }

    static void ptrn1(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when 1 row is priinted, we need to add a newline
            System.out.println();
        }
    }

}

/*

*
* *
* * *
* * * *

 */
