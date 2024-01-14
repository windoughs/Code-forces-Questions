import java.util.Scanner;

public class ASecretSport{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            System.out.println(s.charAt(n-1));
        }
        in.close();
    }
}