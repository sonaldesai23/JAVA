package core_java.basics.strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //its not creating new object.
        //its making changes in current obj only.
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); //O/P -  all characters from a-z.
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

    }
}
