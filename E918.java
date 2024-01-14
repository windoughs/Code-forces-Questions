import java.util.*;

public class E918 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for(int i = 0 ; i  < n ; i++){
                arr[i] = in.nextLong();
            }
            System.out.println(isPossible(arr));
        }
    }
    public static boolean isPossible(long[] arr){
        int p1 = 0 , p2 = 1 , n = arr.length;
        long a = 0 , b = 0;
        if(n == 1) return false;
        while(p1 < n && p2 < n){
            a += arr[p1];
            b += arr[p2];
            p1 += 2;
            p2 += 2;
            if(a == b) return true;
        }
        return false;
    }
}
