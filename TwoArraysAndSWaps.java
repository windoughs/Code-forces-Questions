import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSWaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0 ; i < n ; i++) a[i] = in.nextInt();
            for(int j = 0 ; j < n ; j++) b[j] = in.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int sum = 0;
            for(int o = 0 ; o < n ; o++){
                if (a[o] < b[n-1-o] && k > 0){
                    int temp = a[o];
                    a[o] =  b[n-1-o];
                    b[n-1-o] = temp;
                    sum += a[o];
                    k--;
                }
                else sum += a[o];
            }
            System.out.println(sum);
        }
          in.close();
    }
}
