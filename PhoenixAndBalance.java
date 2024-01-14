import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for(int i = 1 ; i <= n; i++){
                arr[i-1] = (2 << i)/2;
            }
           // System.out.println(Arrays.toString(arr));
           long sum1 = 0 , sum2 = 0;
           int ind = n - 2, c = n / 2;
           sum2 += arr[n-1];
           while(c-- > 0){
                sum1 += arr[ind];
                ind--;
           }
           while(ind >= 0){
                sum2 += arr[ind];
                ind--;
           }
           System.out.println(Math.abs(sum1 - sum2));
           
        }
        in.close();
    }
}
