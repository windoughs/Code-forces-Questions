import java.util.*;
public class AFootBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int zeros = 0 , ones = 0;
        boolean ans = false;
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == '0') {
                zeros++;
                ones = 0;
                if (zeros >= 7) {
                    ans = true;
                    break;
                }
            }
            else{
                ones++;
                zeros = 0;
                if (ones >= 7) {
                    ans = true;
                    break;
                }
            }
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
    
}
