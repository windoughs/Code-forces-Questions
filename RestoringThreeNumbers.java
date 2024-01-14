import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i  = 0 ; i < 4 ; i++) arr[i] = in.nextInt();
        Arrays.sort(arr);
        System.out.println( (arr[3] - arr[0] )  + " " + (arr[3] - arr[1]) + " " + (arr[3] - arr[2]));
        in.close();
    }


    
}
