package core_java.DSA._01_linear_search;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sonal";
        char target = 'n';
        // boolean ans = search(name , target);
        // System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray()));
        // o/p - [S, o, n, a, l]  char array.
    }


    static boolean search2 (String str, char tget) {
        if(str.length() == 0) {
            return false;
        }

        //enhanced for loop
        for(char ch : str.toCharArray()) {  
            if(ch == tget) {
                return true;
            }
        }
        return false;
    }


    static boolean search (String str, char tget) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i <str.length(); i++) {
            if(tget == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
 