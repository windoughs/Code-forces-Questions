import java.util.Scanner;

public class cAPSLOCK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String a = s.substring(0,1).toLowerCase() + s.substring(1, s.length()).toUpperCase();
        String b = s.toUpperCase();
        String ans = s;
        if (s.equals(a)){
            ans = s.substring(0,1).toUpperCase() + s.substring(1, s.length()).toLowerCase();
        }
        else if (s.equals(b)){
            ans = s.toLowerCase();
        }
        System.out.println(ans);
        in.close();
    }
}
