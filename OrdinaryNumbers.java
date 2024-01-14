import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long ans = 0;
           for(long i = 1 ; i <= 9 ; i++){
                long s = i;
                while(s <= n){
                    ans++;
                    s = ( s * 10) + i;
                }
           }
            System.out.println(ans);
        }
        in.close();
    }
}
