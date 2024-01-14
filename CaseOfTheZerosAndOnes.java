import java.util.Scanner;

public class CaseOfTheZerosAndOnes{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int zeros = 0 , ones = 0;
        for(int i = 0 ; i < n ; i++){
            if (s.charAt(i) == '0') zeros++;
            else ones++;
        }
        System.out.println(n - (Math.min(zeros, ones) * 2));
        in.close();
    }
}