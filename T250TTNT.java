import java.util.Arrays;
import java.util.Scanner;

public class T250TTNT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            long[] arr2 = new long[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextLong();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            long diff = arr2[n-1] - arr2[0];
            int chunks = 2;
            while(chunks <= (n/2)){
                if (n % chunks == 0){
                    int ind = 0 , k = 0;
                    long  use = 0;
                    long[] my = new long[n/chunks];
                    while(ind < n){
                        int j = 1;
                        use = 0;
                        while(j <= chunks){
                            use += arr[ind];
                            ind++;
                            j++;
                        }
                        my[k] = use;
                        k++;
                    }
                    Arrays.sort(my);
                    if(my[my.length - 1] - my[0] > diff) diff = my[my.length - 1] - my[0];
                }
                chunks++;
            }
            System.out.println(diff);

        }
        in.close();
    }
}
