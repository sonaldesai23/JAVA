package core_java.basics.Patterns;

public class Pattern {
    public static void main(String[] args) {
        ptrn6(5);
    }
    static void ptrn4(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col+" " );
            }
            System.out.println();
            /*
            1 
            1 2
            1 2 3
            1 2 3 4
             */
        }
    }

    static void ptrn5(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* " );
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         * 
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         
         */
    }
    
    static void ptrn6(int n){
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for(int clm = 5; clm >= clm+1; clm--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
