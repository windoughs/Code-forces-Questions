import java.util.Scanner;

public class AtreasureChest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int x = in.nextInt();
            int y = in.nextInt();
            int k = in.nextInt();
            if (x > y){
                System.out.println(x);
            }
            else{
                if ((y-x) <= k){
                    System.out.println(y);
                }
                else{
                    System.out.println(x + k + (y-x-k)*2);
                }
            }
        }
        in.close();
    }
}
