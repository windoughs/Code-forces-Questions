import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while(t-- > 0){
            long w = in.nextLong();
            long h = in.nextLong();
            long n = in.nextLong();
            long c = 1;
            while(w % 2 == 0 || h % 2 == 0){
                if (w % 2 == 0) {
                    c = c * 2;
                    w = w / 2;
                }
                else if (h % 2 == 0){
                    c = c * 2;
                    h = h / 2;
                }
            }
            if (c >= n ) System.out.println("YES");
            else System.out.println("NO");

        }
        in.close();
    }
}
