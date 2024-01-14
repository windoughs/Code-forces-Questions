import java.util.Arrays;
import java.util.Scanner;

public class Atwins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0 , my = 0 , c = 0;
        for(int i = 0 ; i <  n ; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        Arrays.sort(arr);
        for(int j = 0 ; j < n ; j++){
            sum = sum - arr[n - 1 - j];
            my = my + arr[n - 1 - j];
            c++;
            if (my > sum) break;
        }
        System.out.println(c);
        in.close();
    }
}
