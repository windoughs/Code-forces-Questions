import java.util.Scanner;

public class CandiesAndSisters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long ans = n % 2 == 0 ? (n/2) - 1 : (n / 2);
            System.out.println(ans);
        }
        in.close();
    }
}
