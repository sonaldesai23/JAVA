package core_java.basics.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3); //100
        System.out.println((char)('a' + 3)); //d

        System.out.println("a" + 1); //a1
        //this is same as after few steps: "a" + "1"
        //Integer will be converted to Integer that will call toString()

        System.out.println("Sonal" + new ArrayList<>()); //Sonal[]
        System.out.println("Sonal" + new Integer(56)); //Sonal56
       
        String ans = new Integer(56) + "" +  new ArrayList<>();
        System.out.println(ans); //56[]
    }
}
 