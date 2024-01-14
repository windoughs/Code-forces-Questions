import java.util.Scanner;

public class AMAximumGCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            System.out.println(n/2);
        }
        in.close();
    }
}
