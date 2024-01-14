import java.util.Scanner;

public class ShortSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            if (s.length() == 2) System.out.println(s);
            else{
                String ans = String.valueOf(s.charAt(0));
                for(int i = 1 ; i < s.length(); i = i + 2){
                    ans = ans + String.valueOf(s.charAt(i));
                }
                System.out.println(ans);
            }
           
            }
             in.close();
        }
    }

