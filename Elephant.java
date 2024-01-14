import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ( n <= 5) System.out.println(1);
        else{
            int ans = n % 5 == 0 ? n / 5 : (n / 5) + 1;
            System.out.println(ans);
        }
        in.close();
    }
}
