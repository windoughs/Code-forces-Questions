import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for(int i = 0 ; i <  n; i++){
                arr[i] = in.nextInt();
                sum += Math.abs(arr[i]);
            }
            int opr = 0 , ind = 0;
            while(ind < n){
                if(arr[ind] < 0){
                    int j = ind + 1,use = j;
                    while(j < n){
                        if(arr[j] > 0){
                            break;
                        }
                        else if(arr[j] < 0){
                                use = j;
                        }
                        j++;
                    }
                    opr++;
                    ind = use + 1;
                }
                else ind++;
            }
            System.out.println(sum + " " + opr);

        }
        in.close();
    }
}
