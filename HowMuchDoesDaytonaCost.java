import java.util.Scanner;

public class HowMuchDoesDaytonaCost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            boolean check = false;
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
                if(arr[i] == k) check = true;
            }
            if(check)System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}