import java.util.Scanner;

public class ShortSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            if((s.equals("abc") || s.equals("acb")) || (s.equals("cba") || s.equals("bac")))
            System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}