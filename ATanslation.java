import java.util.Scanner;

public class ATanslation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        boolean check = true;
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        if (check) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
}
