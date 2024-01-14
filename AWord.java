import java.util.Scanner;

public class AWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int u = 0 , l = 0;
        String ans;
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) u++;
            else l++;
        }
        if (u > l) ans = s.toUpperCase();
        else ans = s.toLowerCase();
        System.out.println(ans);
        in.close();
    }
}
