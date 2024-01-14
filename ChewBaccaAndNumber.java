import java.util.Scanner;

public class ChewBaccaAndNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long num = 0 , c = 0;
        while(n > 0){
            long rem = n % 10;
            if (rem > 9/2 && n != 9) rem = 9 - rem;
            if(rem == 0 && num == 0) c++;
            num = num*10 + rem;
            n = n / 10;
        }
        while(num > 0){
            System.out.print(num%10);
            num = num/10;
        }
        while(c-- > 0){
            System.out.print(0);
        }
        in.close();
        
    }
}
