import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLAterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
       // long l = in.nextLong();
        long[] arr = new long[n];
        double max_diff = 0;
        for(int i = 0 ; i < n ; i++) arr[i] = in.nextLong();
        Arrays.sort(arr);
        for(int j = 1 ; j < n ; j++){
            if (arr[j] - arr[j - 1] > max_diff) max_diff = arr[j] - arr[j - 1];
        }
        System.out.format("%.10f" , (max_diff / 2));
        in.close();
    }
}
