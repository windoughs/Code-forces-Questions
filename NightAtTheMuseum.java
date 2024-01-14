import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 0;
        int prev = 'a' - 96;
        for(int i = 0 ; i < s.length(); i++){
            int ch = s.charAt(i) - 96;
int add = Math.abs(ch - prev) > 26 -Math.abs(ch - prev) ? 26 -Math.abs(ch - prev) : Math.abs(ch - prev);
            c += add;
          prev = ch;
        }
        System.out.println(c);
        in.close();
    }
}
