import java.util.Scanner;

public class BFairDecision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[3];
            for(int i = 0 ; i < n ; i++){
                int x = in.nextInt();
                arr[x]++;
            }
            if ((arr[1]%2 == 0) && (arr[2] % 2 == 0)) System.out.println("YES");
            else if (arr[1] != 0 && (arr[2] % 2 != 0 && (arr[1]) % 2 == 0)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
