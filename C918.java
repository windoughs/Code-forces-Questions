import java.util.Scanner;

public class C918 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextLong();
                sum += arr[i];
            }
            long root = (long)Math.sqrt(sum);
            if(root * root == sum) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
