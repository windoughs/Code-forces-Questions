import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
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
            boolean check = true;
            for(int j = 0 ; j < n - 1 ; j++){
                if (arr[j + 1] - arr[j] > 1) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
           
        }
         in.close();
    }
}
