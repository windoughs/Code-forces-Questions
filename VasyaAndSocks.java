import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;
        int c = 0;
        while(n > 0){
            ans += n + c;
            c = n % m != 0 ? 1 : 0;
            n = n / m ;
        }
        System.out.println(ans);
        in.close();
    }
}
