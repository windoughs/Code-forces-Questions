import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long n = in.nextLong();
            long[] arr = {a,b,c};
            Arrays.sort(arr);
            n = n - (Math.abs(arr[2] - arr[1]) + Math.abs(arr[2] - arr[0]));
            if (n >= 0){
                if (n % 3 == 0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        in.close();

    }
}
