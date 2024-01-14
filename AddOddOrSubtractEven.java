import java.util.Scanner;

public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextInt();
            long b = in.nextLong();
            long ans = 0;
            if (a < b){
                ans = (b-a) % 2 != 0 ? 1 : 2;
            } 
            else if (b < a){
                ans = (a-b) % 2 == 0 ? 1 : 2;
            }
            System.out.println(ans);
        }
        in.close();
    }
}
