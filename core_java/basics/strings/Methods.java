package core_java.basics.strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String nm = "Sonal Desai Hwllo world";
        System.out.println(nm);
        System.out.println(Arrays.toString(nm.toCharArray()));
        System.out.println(nm.toLowerCase());
        System.out.println(nm.indexOf('a'));
        System.out.println("     sonal  ".strip());
        System.out.println(Arrays.toString(nm.split(" ")));;
    }
}
