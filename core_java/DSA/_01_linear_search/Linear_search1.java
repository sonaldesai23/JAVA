package core_java.DSA._01_linear_search;
import java.util.Scanner;

public class Linear_search1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        // input -
        System.out.println("Enter Arr elemnts - ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to serch :");
        int num = sc.nextInt();

        int pos = -1;
        for (int j = 0; j < arr.length; j++) {
            if (num == arr[j]) {
                pos = j;
                break;
            }
        }
        if (pos != -1) {
            System.out.println(num + " is present at position " + pos);
        } else {
            System.out.println(num + " is not present in the array");
        }

        sc.close();
        
    }
}
