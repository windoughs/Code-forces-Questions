import java.util.Arrays;
import java.util.Scanner;

public class BHonestCoach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
            Arrays.sort(arr);
            int diff = 100000;
            for(int i = 0 ; i < n - 1 ; i++){
                if ((arr[i+1] - arr[i]) < diff) diff = arr[i+1] - arr[i];
             }
            System.out.println(diff);

        }
        in.close();
    }
}
