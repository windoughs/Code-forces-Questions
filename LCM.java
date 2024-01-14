import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long l = in.nextInt();
            long r = in.nextLong();
            long a = l;
            long b = 2 * a;
            if (b <= r) System.out.println(a + " " + b);
            else System.out.println("-1 -1");
        }
        in.close();
    }
}
