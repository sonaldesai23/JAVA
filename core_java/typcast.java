import java.util.Scanner;

public class typcast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // int num = sc.nextInt();
        // System.out.println(num);
 

        //TypeCasting
        int num = (int)(34.54f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 259;
        byte b = (byte)(a);// byte- max size is 256
        System.out.println(b);   // gives the remainder . 
        sc.close();

    }
}
