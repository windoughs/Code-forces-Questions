import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int[] arr = {a,b,c,d};
            Arrays.sort(arr);
            if ((arr[3] == a && arr[2] == b) || (arr[3] == b && arr[2] == a))
            System.out.println("NO");
            else if((arr[3] == c && arr[2] == d) || (arr[3] == d && arr[2] == c))
            System.out.println("NO");
            else System.out.println("YES");
            
        }
        in.close();
    }
}
