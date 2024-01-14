import java.util.Arrays;
import java.util.Scanner;

public class APuzzles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];
        for(int i = 0 ; i < m ; i++) arr[i] = in.nextInt();
        Arrays.sort(arr);
        int min = 10000 , diff;
        for(int j = 0 ; j  < m ; j++){
            if ((j + n - 1) < m ){
                diff = arr[j+n-1] - arr[j];
                if (diff < min) min = diff;
        }
    }
    System.out.println(min);
    in.close();
}
}
