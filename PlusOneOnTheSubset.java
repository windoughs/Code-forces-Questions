import java.util.Scanner;

public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            long max = 0 , min = 1000000000;
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextLong();
                if (arr[i] > max) max = arr[i];
                if(arr[i] < min) min = arr[i];
            }
            System.out.println(max-min);
        }
        in.close();
    }
}
