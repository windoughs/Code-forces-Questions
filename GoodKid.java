import java.util.Scanner;
import java.util.Arrays;
public class GoodKid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            arr[0] += 1;
            int ans = 1;
            for(int i = 0 ; i < n ; i++){
                ans = ans * arr[i];
            }
            System.out.println(ans);
        }
        in.close();
    }
}
