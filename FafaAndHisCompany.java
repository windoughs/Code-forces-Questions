import java.util.Scanner;

public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        for(int i = 1 ; i < n ; i++){
            if (n % i == 0) c++;
        }
        System.out.println(c);
        in.close();
    }
}
