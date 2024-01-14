import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x = in.nextLong();
        int c = 0;
        for(int i = 1 ; i <= n ; i++){
            if (x % i == 0 && ((x/i) <= n)) {
                c++;
            }
        }
        System.out.println(c);
        in.close();
    }
}
