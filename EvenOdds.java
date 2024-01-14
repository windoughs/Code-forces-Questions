import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long ans;
       if (n % 2 == 0 ){
            if (k <= (n / 2))  ans = 1 + (k - 1) * 2;
            else ans = 2 + ((k - n / 2) - 1 ) * 2;
       }
       else{
        if ( k <= (n / 2) + 1 ) ans = 1 + (k - 1) * 2;
        else ans = 2 + (k - (n / 2 + 1) - 1) * 2;
       }
       System.out.println(ans);
       in.close();
    }
}
