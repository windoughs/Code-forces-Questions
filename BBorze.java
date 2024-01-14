import java.util.Scanner;

public class BBorze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  s = in.next();
        String ans = "";
        int i;
        for( i = 0 ; i < s.length() - 1 ;){
            if(s.substring(i, i + 2).equals("--")) {
                ans = ans + "2";
                i = i + 2;
            }
            else if(s.substring(i, i + 2).equals("-.")) {
                ans = ans + "1";
                i = i + 2;
            }
            else {
                ans = ans + "0";
                i++;
            }
        }
        if (i == s.length() - 1) ans = ans + "0";
        else if(s.substring(s.length() - 2, s.length()).equals("..")) ans = ans + "0";
        System.out.println(ans);
        in.close();
    }
}
