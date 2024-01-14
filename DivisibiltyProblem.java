import java.util.Scanner;

public class DivisibiltyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            if (a % b == 0) System.out.println(0);
            else {
                if (a < b) System.out.println(b - a);
                else System.out.println(b - (a % b));
            }
        }
        in.close();
    }
}
