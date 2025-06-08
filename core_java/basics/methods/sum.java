package core_java.basics.methods;

public class sum {
    public static void main(String[] args) {
        // int ans = sum();
        // System.out.print("Sum: " + ans);

        int ans = sum2(20,30);
        System.out.print("Sum: " + ans);
    }
    static int sum2(int a, int b) {
        int sum = a +b;
        return sum;
    }

    // static int sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter num 1: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter num 2: ");
    //     int num2 = sc.nextInt();

    //     int sum = num1 + num2;
    //     sc.close();
    //     return sum;
    // }

    /*
        return_type name(args) {
            //body
            return statement;
        }
    */

}

