package core_java.basics.methods;

public class shadowing {
    static int x = 5; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //5
        int x = 35; // the class variable at line 4 is shadowed by this.
        // int x;
        // System.out.println(x); // scope will begin when value is initialized.
        x = 40;
        System.out.println(x);//35
        xyz();
    }

    static void xyz() {
        System.out.println( x); //5
    }
}
