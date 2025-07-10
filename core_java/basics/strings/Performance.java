package core_java.basics.strings;

public class Performance {
    public static void main(String[] args) {

        // System.out.println("a" + 'b');  //o/p - ab
        String series = "";
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); //O/P -  all characters from a-z.
            series = series + ch;//o/p- abcdefghijklmnopqrstuvwxyz
        }
        System.out.println(series);
        // here in above prog, everytime its creating a new string object.
        
    }
    
}
