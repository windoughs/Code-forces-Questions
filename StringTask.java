import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            if (((ch != 'a' && ch != 'e') && (ch != 'i' && ch != 'o')) && (ch != 'u' && ch != 'y')){
                ans = ans + "." + String.valueOf(ch);
            }
        }
        System.out.println(ans);
        in.close();
    }
}
