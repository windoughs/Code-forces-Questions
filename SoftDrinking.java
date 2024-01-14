import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();
        int a = (k * l) / nl;
        int b = c * d;
        int e = p / np;
        int min = (a < b && a < e) ? a : (b < e) ? b : e;
        System.out.println(min / n);
        in.close();
    }
}
