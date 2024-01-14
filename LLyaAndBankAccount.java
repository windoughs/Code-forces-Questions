import java.util.Scanner;

public class LLyaAndBankAccount {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        long n = in.nextLong();
        String ans = "";
        if (n >= 0) System.out.println(n);
        else{
            String s = String.valueOf(n);
            int a = s.charAt(s.length() - 2) - 48;
            int b = s.charAt(s.length() - 1) - 48;
            if (a < b){
                ans = String.valueOf(n/10);
            }
            else{
             ans =   s.substring(0, s.length() - 2) + String.valueOf(s.charAt(s.length() - 1));
            }
            if (ans.charAt(1) == '0') ans = ans.substring(1);
            System.out.println(ans);
        }
        in.close();
    }
}
