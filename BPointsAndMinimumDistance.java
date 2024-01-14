import java.util.Arrays;
import java.util.Scanner;

public class BPointsAndMinimumDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[2 * n];
            for(int i = 0 ; i <  (2 * n); i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int s = 0 , m = n ;
            int ind = 0;
            int[][] ans = new int[n][2];
            while(s < n){
                ans[ind][0] = arr[s];
                ans[ind][1] = arr[m];
                s++;
                m++;
                ind++;
            }
            int sum = 0;
            for(int i = 0 ; i < n - 1 ; i++){
                sum = sum + (  (Math.abs(ans[i][0] - ans[i + 1][0])) + (Math.abs(ans[i][1] - ans[i+1][1])));
            }
            System.out.println(sum);
            for(int j = 0 ; j < n ; j++){
                System.out.println(ans[j][0] + " " + ans[j][1]);
            }
        }
        in.close();
    }
}
