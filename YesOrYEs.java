import java.util.Scanner;

public class YesOrYEs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            String ans = "";
            for(int i = 0 ; i < 3 ; i++){
                char ch = s.charAt(i);
                boolean upper = IsUpper(ch);
                if (!upper){
                    ans = ans + String.valueOf(ch).toUpperCase();
                }
                else ans = ans + String.valueOf(ch);
            }
            if (ans.equals("YES")) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
    public static boolean IsUpper(char ch){
        if (ch >= 65 && ch <= 90) return true;
        return false; 
    }
}
