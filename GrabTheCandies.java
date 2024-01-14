import java.util.Scanner;

public class GrabTheCandies {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-- > 0){
        int n = in.nextInt();
        int[] arr = new int[n];
        int evens = 0 , odds = 0;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
            if(arr[i] % 2 == 0)evens += arr[i];
            else odds += arr[i];
        }
        if (evens > odds) System.out.println("YES");
        else System.out.println("NO");
    }
    in.close();
   } 
}
