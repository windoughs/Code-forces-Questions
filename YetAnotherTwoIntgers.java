import java.util.Scanner;

public class YetAnotherTwoIntgers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long diff = Math.abs(b - a);
            if (a == b) System.out.println(0);
            else if (diff <= 10) System.out.println(1);
            else{
                long ans = (diff % 10 == 0) ? (diff / 10) : (diff / 10) + 1;
                System.out.println(ans);
            }
            
        }
        in.close();
    }
}
