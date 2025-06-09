package core_java.basics.methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(num); num is not accesible in main function, 
        // bcoz, it belongs to random() function.
        // its not accesible outside the random() function.

        {
            // int a = 78; 
            //already initializied outside the block in the same method, hence u cannot initialize it again.
            a = 78;
            a = 100;
            // a = 78;
            int c = 99;
            //values initialized in this block , will remain in block.
        }
        System.out.println(a); 
        // System.out.println(c); //cannot used outside the block.

        //Scoping in for loop
        for (int i = 0; i<4; i++) {
            System.out.println(i);
        }
    }

    static void random() {
        int num =67;
        System.out.println(num);
    }
}
