import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c = 1;
        while(true){
            if ((n % 10 == 0 || n % 10 == k)) break;
            c++;
            n = n * c;
            System.out.println(n);
        }
        System.out.println(c);
        in.close();
    }
}
