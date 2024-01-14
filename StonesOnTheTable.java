import java.util.*;
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int c = 0;
        for(int i = 0 ; i < n - 1; i++){
            if (s.charAt(i) == s.charAt(i + 1)) c++;
        }
        System.out.println(c);
        in.close();
    }
}
