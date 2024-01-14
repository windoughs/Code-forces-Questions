import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0 ;
        int[] arr = new int[n];
        for( int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        int sum = 0 ; 
        for(int j = 0 ; j < n ; j++) sum += max - arr[j];
        System.out.println(sum);
        in.close();
    }
}
