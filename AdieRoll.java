import java.util.Scanner;

public class AdieRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int w = in.nextInt();
        int max = y > w ? y : w;
        int a = (6-max)+1;
        int b = 6;
        int gcd = GCD(a,b);
        System.out.println((a/gcd) + "/" + (b/gcd));
        in.close();
    }
    public static int GCD(int a , int b){
        if (b == 0) return a;
        return GCD(b,a%b);
    }
}
