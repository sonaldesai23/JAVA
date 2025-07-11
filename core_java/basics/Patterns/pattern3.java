package core_java.basics.Patterns;

public class pattern3 {
    public static void main(String[] args) {
        ptrn3(5);
    }
    static void ptrn3(int n){
        for(int row = 0; row <= n; row++) {
            for(int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed, we need to add a newline
            System.out.println();
        }
    }
}
