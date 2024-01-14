import java.util.Scanner;

public class AsimpleDesign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long x = in.nextInt();
            long k = in.nextInt();
            while((sum(x)) % k != 0){
                x++;
            }
            System.out.println(x);
        }
        in.close();
    }
    public static long sum(long num){
        long s = 0 ;
        while(num > 0){
            s += num % 10;
            num = num / 10;
        }
        return s;
    }
}
