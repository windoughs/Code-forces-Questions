import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int sum1 = s.charAt(0) - 48 + s.charAt(1) - 48 + s.charAt(2) - 48;
            int sum2 = s.charAt(3) - 48 + s.charAt(4) - 48 + s.charAt(5) - 48;
            if (sum1 == sum2) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
        

    }
}
