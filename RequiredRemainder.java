import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long x = in.nextLong();
            long y = in.nextLong();
            long n = in.nextLong();
            long m = n % x;
            if(m >= y) System.out.println(n - m + y);
            else System.out.println(n - m - x + y);
        }
        in.close();
    }
}
