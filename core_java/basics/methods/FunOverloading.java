package core_java.basics.methods;

public class FunOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Sonal Desai");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
