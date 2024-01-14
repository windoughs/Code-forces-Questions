import java.util.Scanner;

public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int h = in.nextInt();
            int m = in.nextInt();
            int ans = 0;
            if (h == 0 && m == 0) ans = 0;
            else {
                ans += 60 - m +(( 24 - (h+1))*60);
            }
            System.out.println(ans);
        }
        in.close();
    }
}
