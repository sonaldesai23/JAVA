package core_java.basics.methods;
import java.util.Arrays;

//variable lenght arguments -used when we dont know how many args are needed..
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,78,87,90);
        multiargs(2, 3, "sonal", "shivraj");
    }
    
    static void multiargs(int a, int b, String ...v) {

    }
    static void fun(int ...a) {
        // int ...a - internally it takes an array of int.
        System.out.println(Arrays.toString(a));
    }
}
