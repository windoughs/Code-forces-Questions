import java.util.Scanner;

public class FlowerCityFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextLong();
            }
            boolean ans = true;
            if(n != arr[0]){
                ans = false;
            }
            else{
                long sum = arr[n-1];
                for(int j = 1 ; j < n ; j++){
                    sum += (Math.abs(arr[j] - arr[j-1]));
                }
                if(sum != n) ans = false;
            }
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    } 
}
