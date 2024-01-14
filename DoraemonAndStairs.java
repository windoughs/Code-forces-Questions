import java.util.Scanner;

public class DoraemonAndStairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int steps =  n % 2 == 0 ? n/2 : n/2 + 1;
        boolean check = false;
        while(steps <= n){
            if (steps % m == 0){
                    check = true;
                    break;
            }
                steps++;
        }
        if (check) System.out.println(steps);
        else System.out.println("-1");
        in.close();
    }
}
