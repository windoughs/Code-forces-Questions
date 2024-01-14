import java.util.Scanner;

public class yarikAndArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int max = -100000;
            for(int i = 0 ;i < n ; i++){
                arr[i] = in.nextInt();
                if(arr[i] > max) max = arr[i];
            }
            long ans = max;
            for(int j = 0 ; j < n ; j++){
                 long sum = arr[j];
                for(int i = j+1;i < n ; i++){
                int a = arr[i] % 2 == 0 ? 1 : 0;
                int b = arr[i-1] % 2 == 0 ? 1 : 0;
                if(a != b){
                    sum += arr[i];
                    if(sum > ans) ans = sum;
                }
                else sum = arr[i];
                }
            }
            System.out.println(ans);

        }
        in.close();
    }
}
