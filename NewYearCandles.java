import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;
        while(a > 0){
            ans += a;
            int rem = a % b;
            a = a / b ;
            if ( rem != 0 && (a + rem) % b == 0) ans++;
        }
        System.out.println(ans);
        in.close();
    }
}
