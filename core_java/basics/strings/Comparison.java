package core_java.basics.strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Sonal";
        String b = "Sonal";
        String c = a;
        // System.out.println(c == a);  //-> true
        //==
        // System.out.println(a == b);   // -> true

        String nm1 = new String("Sonal");
        String nm2 = new String("Sonal");

        // System.out.println(nm1 == nm2);  //-> false

        System.out.println(nm1.equals(nm2));  //method -> true
    }
}
