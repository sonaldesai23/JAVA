package core_java.basics;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
         
        switch (fruit) {
           case "Mango":
               System.out.println("King of fruits");
               break;
           case "Apple":
               System.out.println("A sweet red fruit");
               break;
           case "Orange":
               System.out.println("Round fruit");
               break;
           case "Grapes":
               System.out.println("Small round fruit");
               break;
           default:
               System.out.println("please enter a valid fruit");
       }
           

        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

       switch (day) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
               System.out.println("Weekday");
               break;
           case 6:
           case 7:
               System.out.println("Weekend");
               break;
           default:
               System.out.println("Invalid day");
       }

        // switch (day) {
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //     case 6, 7 -> System.out.println("Weekend");
        // }
        sc.close();
    }
    
}
