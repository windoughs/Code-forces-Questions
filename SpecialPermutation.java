import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int mid = n % 2 == 0 ? n / 2 : (n/2) + 1;
            while(n > 0){
                if (n == mid) System.out.print(1 + " ");
                else if (n == 1) System.out.print(mid + " ");
                else System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }
        in.close();
    }
}
