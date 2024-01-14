import java.util.Arrays;
import java.util.Scanner;

public class APresents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[][] my = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
            my[i][0] =arr[i];
            my[i][1] = i + 1;
        }
        Arrays.sort(my , (a , b) -> a[0] - b[0]);
        for(int j = 0 ; j < n ; j++) System.out.print(my[j][1] + " ");
        in.close();
    }
}
