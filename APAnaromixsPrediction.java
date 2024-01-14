import java.util.Scanner;

public class APAnaromixsPrediction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt(),use = n + 1;
        while(true){
            boolean check = IsPrime(use);
            if (check) break;
            use++;
        }
        if (m == use) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
    public static boolean IsPrime(int num){
        for(int i = 2 ; (i*i) <= num ; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
