import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] candies = new long[n];
            long[] oranges = new long[n];
            long min1 = 1000000000,min2 = 1000000000;
            for(int i = 0 ; i < n ; i++) {
                candies[i] = in.nextLong();
                if (candies[i] < min1) min1 = candies[i];
            }
            for(int j = 0 ; j < n ;j ++){
                oranges[j] = in.nextLong();
                if (oranges[j] < min2) min2 = oranges[j];
            }
            long ans = 0;
            for(int k = 0 ; k < n ; k++){
                long add1  = Math.abs(candies[k] - min1);
                long add2 = Math.abs(oranges[k] - min2);
                long to_add = add1 > add2 ? add1 : add2;
                ans += to_add;
                
            }
            System.out.println(ans);
          
        }
          in.close();
    }
}
