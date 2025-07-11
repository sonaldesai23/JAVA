package core_java.basics.Patterns;

public class pattern2 {
    public static void main(String[] aegs) {
        ptrn2(5);
    }

    static void ptrn2(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //when 1 row is priinted, we need to add a newline
            System.out.println();
        }
    }

}

/*

*****
*****
*****
*****
*****

 */

