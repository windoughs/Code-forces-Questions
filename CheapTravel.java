import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int price_a = a * n;
        int price_b = 0;
        if (n % m == 0) price_b = (n / m) * b;
        else {
            price_b = ((n / m) * b) ;
            int add = b   >  (n % m)*a ? (n % m)*a : b;
            price_b = price_b + add;
        }
        int ans = price_a < price_b ? price_a : price_b;
        System.out.println(ans);
        in.close();
    }
}
