import java.util.Scanner;

public class AKeyBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char direction = in.next().charAt(0);
        String s = in.next();
        String my = "qwertyuiopasdfghjkl;zxcvbnm,./" ;
        int c = direction == 'R' ? -1 : 1;
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            int ind = my.indexOf(s.charAt(i)) + c;
            ans += String.valueOf(my.charAt(ind));
        }
        System.out.println(ans);
        in.close();
    }
}
