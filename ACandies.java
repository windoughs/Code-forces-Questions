import java.util.Scanner;

public class ACandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long sum  = in.nextLong();
            for(long k = 2 ; k < 1000000000 ; k++){
                double p = Math.pow(2, k) - 1;
                if (sum % (p) == 0) {
                    System.out.println((long)(sum/p));
                    break;
                }
            }

        }
        in.close();
    }
}
