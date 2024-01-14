import java.util.Scanner;

public class AKefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        int c = 1 , max = 1;
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextLong();
        }
        for(int j = 1 ; j < n; j++){
            if (arr[j] >= arr[j - 1]) c++;
            else{
                if (c > max) max = c;
                c = 1;
            }
        }
        if (c > max) max = c;
        System.out.println(max);
        in.close();
    } 
}
