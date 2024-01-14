

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = x;
            arr[n-1] = y;
            int use = 1 , a = 2;
            boolean desc = true , asc = true;
            for(int i = n - 2; i >= 1 ; i--){
                arr[i] = y-use;
                use = use + a;
                a++;
            }
            if (arr[1]-arr[0] <= arr[2] - arr[1]) desc = false;
            if (arr[0] >= arr[1]) asc = false;
            if (asc && desc) {
                for(int j = 0 ; j < n ; j++) System.out.print(arr[j] + " ");
                System.out.println();
            }
            else System.out.println("-1");
            System.out.println(Arrays.toString(arr));

        }
        in.close();
    }
}
