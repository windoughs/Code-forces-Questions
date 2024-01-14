import java.util.Arrays;
import java.util.Scanner;

public class DBalancedRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long k = in.nextLong();
            long[] arr = new long[n];
            for(int i = 0 ; i < n ; i++) arr[i] = in.nextLong();
            int c = 1 , max = 0;
            Arrays.sort(arr);
            for(int j = 1 ; j < n ; j++){
                if (arr[j] - arr[j - 1] <= k) {
                    c++;
                }
                else{
                    if (c > max) max = c;
                    c = 1;
                }
            }
            if (c > max) max = c;
            System.out.println(n - max);
           
        }
         in.close();
    }
}
