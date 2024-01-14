import java.util.Scanner;

public class DSameDifference{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
            int c = 0;
            for(int j = 0 ; j < n ; j++){
                for(int k = j  + 1 ; k < n ; k++){
                    if (arr[k] - arr[j] == k - j) c++;
                }
            }
            System.out.println(c);
        }
        in.close();
    }
}