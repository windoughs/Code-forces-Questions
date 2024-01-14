import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String ans = "";
        for(int i = 0 ; i < a.length() ; i++){
            if (a.charAt(i) != b.charAt(i)) ans = ans + "1";
            else ans = ans + "0";
        }
        System.out.println(ans);
        in.close();
    }
}
