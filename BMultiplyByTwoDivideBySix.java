import java.util.Scanner;

public class BMultiplyByTwoDivideBySix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            int c = 0;
            while(n > 1){
                if (n % 6 == 0){
                    n = n / 6;
                    c++;
                }
                else{
                    n = n * 2;
                    c++;
                }
                
            }
            System.out.println(c);
        if(n == 1) System.out.println(c);
        else System.out.println("-1");
        
        }
        
        in.close();

    }
}
