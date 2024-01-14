import java.util.Scanner;

public class AminimalSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int min = a < b ? a : b;
            int max = a > b ? a : b;
            int side = min+min;
            if (max > side) side = max;
            System.out.println(side*side);
        }
        in.close();
    }
}
