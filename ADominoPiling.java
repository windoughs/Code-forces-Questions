import java.util.Scanner;
public class ADominoPiling{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println((m*n)/2);
        in.close();
    }
}