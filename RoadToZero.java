import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long ans1 = (x+y) * a;
            long min = a > b ? b : a;
            long max = a > b ? a : b;
            long ans2 = (min * b ) + (max-min) * a;
            long final_ans = ans1 > ans2 ? ans2 : ans1;
            System.out.println(final_ans);
        }
        in.close();
    }
}
