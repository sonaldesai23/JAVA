package core_java.basics;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float sum = a + b;

        System.out.println("sum =" + sum);
        sc.close();
    }
}
