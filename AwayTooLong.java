
import java.util.Scanner;
public class AwayTooLong {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            String s = in.next();
            if (s.length() > 10) System.out.println(String.valueOf(s.charAt(0) ) + String.valueOf(s.length() - 2) + String.valueOf(s.charAt(s.length() - 1)) ) ;
            else System.out.println(s);
        }
        in.close();
    }
    
}
