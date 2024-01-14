import java.util.Arrays;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = in.nextInt() ;
            arr[i][1] = in.nextInt();
        }
        Arrays.sort(arr , (a,b) -> Integer.compare(arr[0][0] ,arr[1][0]) );
        for(int j = 0 ; j < n ; j++){
            System.out.println(arr[j][0]);
        }
    }
}
