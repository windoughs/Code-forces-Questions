import java.util.Scanner;

public class ApolyCarpCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextInt();
            if (n % 3 == 0) System.out.println(n/3 + " " + n/3);
            else{
                long a = n / 3;
                long b = a + 1;
                if (a + (b * 2) == n) System.out.println(a + " " + b);
                else System.out.println(b + " " + a);
            }
            
        }
        in.close();
    }
}
