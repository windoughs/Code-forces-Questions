import java.util.Scanner;

public class BDejaVu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int q = in.nextInt();
            long[] arr = new long[n];
            long[] x = new long[q];
            for(int i =  0 ; i < n ; i++){
                arr[i] = in.nextLong();
            }
            for(int i =  0 ; i < q ; i++){
                x[i] = in.nextLong();
            }
            for(int j = 0 ; j < q ; j++){
                long pow = (long)Math.pow(2, x[j]);
                for(int k = 0 ; k < n ; k++){
                    if (arr[k] % pow == 0){
                        long a = (long)Math.pow(2, x[j] - 1);
                        arr[k] += a;
                    }
                }
            }
            for(int k = 0 ; k < n ; k++){
                System.out.print(arr[k] + " ");
            }

        }
        in.close();
    }
}
