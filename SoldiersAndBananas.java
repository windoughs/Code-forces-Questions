import java.util.Scanner;

public class SoldiersAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long k = in.nextLong();
        Long n = in.nextLong();
        Long w = in.nextLong();
        Long ans = ((w * (w + 1) / 2) * k) ;
        if (ans > n) ans = ans - n;
        else ans = ans - ans;
        System.out.println(ans);
        in.close();

    }
}
