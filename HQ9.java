import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean check = false;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if ((ch == 'H' || ch == 'Q') || ch == '9'){
                check = true;
                break;
            }
        }
        if (check) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
    
}
