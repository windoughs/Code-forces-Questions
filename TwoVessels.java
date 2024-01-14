import java.util.Scanner;

public class TwoVessels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int min =  Math.min(a, b);
            int max = Math.max(a, b);
            System.out.println ( (int)(Math.ceil ((max- min) / c)) / 2 );
        }
        in.close();
    }
}
