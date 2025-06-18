package core_java.basics.problems.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sonal";
        char target = 'n';
        boolean ans = search2(name , target);
        System.out.println(ans);
    }


    static boolean search2 (String str, char tget) {
        if(str.length() == 0) {
            return false;
        }

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
 