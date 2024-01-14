import java.util.Scanner;

public class AluckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int max_diff = 0;
            int num = 0;
            while(a <= b){
                int n = a;
                int min = 100000,max = 0;
                while(n > 0){
                    int rem  = n % 10;
                    if (rem > max ) max = rem;
                    if (rem < min) min = rem;
                    n = n / 10;
                }
                if ((max-min) > max_diff) {
                    max_diff = max - min;
                    num = a;
                }
                a++;
            }
            System.out.println(num);
        }
        in.close();
    }
}
