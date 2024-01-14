import java.util.Scanner;

public class MultiplyByTwoAndDivideBySix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            int c1 = 0, c2 = 0;
            while(n % 2 ==  0){
                c1++;
                n = n / 2;
            }
            while(n % 3 == 0){
                c2++;
                n = n / 3;
            }
            if (n == 1){
                if (c1 <= c2){
                    int ans = c1 > c2 ? c2 : c1;
                    ans += Math.abs(c2-c1)*2;
                    System.out.println(ans);
                }
                else System.out.println("-1");
            }
            else System.out.println("-1");

        }
        in.close();
    }
}
