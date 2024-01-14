import java.util.Scanner;

public class YoungPhysicst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0 , b = 0 , c =0;
        while(n-- > 0){
            a = a + in.nextInt();
            b = b + in.nextInt();
            c = c + in.nextInt();
        }
        if ((a == 0 && b == 0) && c == 0) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
}
