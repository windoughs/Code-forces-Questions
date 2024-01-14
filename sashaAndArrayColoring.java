import java.util.Arrays;
import java.util.Scanner;

public class sashaAndArrayColoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ;i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int s = 0 , e = arr.length - 1;
            int sum = 0;
            while(s < e){
                sum += (Math.abs(arr[e] - arr[s]));
                s++;
                e--;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
