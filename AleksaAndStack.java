import java.util.Scanner;

public class AleksaAndStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0 ){
            int n = in.nextInt();
            long a = 1;
            while(n-- > 0){
                System.out.print(a + " ");
                a+= 3;
            }
        }
        in.close();
    }
}
