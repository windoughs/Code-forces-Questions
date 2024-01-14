import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        while(n-- > 0){
            String s = in.next();
            if (s.charAt(0) == '+' || s.charAt(s.length() - 1) == '+') ans++;
            else ans--;
        }
        System.out.println(ans);
        in.close();
    }
}
