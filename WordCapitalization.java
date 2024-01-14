import java.util.Scanner;
import java.lang.Character;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String my = in.next();
        char ch = my.charAt(0);
        if (ch >= 97 && ch <= 122){
            char use  = Character.toUpperCase(ch);
            my = String.valueOf(use) + my.substring(1);
        }
        System.out.println(my);
        in.close();;
    }
}
