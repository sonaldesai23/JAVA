package core_java.basics.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListExmpl {
    public static void main(String[] args) {
        /*
            Syntax -
            ArrayList<Integer> list = new ArrayList<>();
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(6734);
        list.add(2745);
        list.add(67);
        list.add(6734);
        list.add(2745);
        list.add(67);
        list.add(6734);
        list.add(2745);
        list.add(67);
        list.add(6734);
        list.add(2745);
        //12

        // System.out.println(list.contains(67));
        // System.out.println(list.set(0, 99));
        // list.remove(2);

        // System.out.println(list);

        //input -
        System.out.println("Enter list items: ");
        for( int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //output-
        System.out.println(list);

        // get index at any index
        System.out.println(list.get(5));

        
    }
}
