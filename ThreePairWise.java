import java.util.Arrays;
import java.util.Scanner;

public class ThreePairWise{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long[] arr = {x,y,z};
            Arrays.sort(arr);
            if ((arr[0] != arr[1] && arr[0] != arr[2]) && (arr[1] != arr[2]))
            System.out.println("No");
            else if (arr[0] == arr[1] && arr[1] != arr[2])
            System.out.println("No");
            else{
                System.out.println("Yes");
                System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
            }

            
        }
        in.close();
    }
}