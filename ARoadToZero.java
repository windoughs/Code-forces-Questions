import java.util.Scanner;

public class ARoadToZero {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
		    long x = in.nextLong();
		    long y = in.nextLong();
		    long a = in.nextLong();
		    long b = in.nextLong();
		    long max = x > y ? x : y;
		    long min = x < y ? x : y;
		    long ans1 = ((max-min)*a + (min*b) );
		    long ans2 = ((max-min)*a + (2 * a * min) );
		    long ans = ans1 < ans2 ? ans1 : ans2;
		    System.out.println(ans);
		}
        in.close();
		
	}
}
