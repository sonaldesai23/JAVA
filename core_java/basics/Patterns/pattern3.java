package core_java.basics.Patterns;

public class pattern3 {
    public static void main(String[] args) {
        ptrn3(5);
    }
    static void ptrn3(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed, we need to add a newline
            System.out.println();
        }
    }
}

/*
* * * * * 
* * * *
* * *
* *
*
 */
