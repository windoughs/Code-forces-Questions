import java.util.Arrays;
import java.util.Scanner;

public class SortWithStep {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int limit = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
            }
            boolean used = false;
            boolean no_exchange = false;
            for(int j = 0 ; j < n ; j++){
                if (arr[j] != j - 1){
                    for(int k = j + 1 ; k < n ; k++){
                        if (arr[k] == j - 1){
                            if (Math.abs(j - k) == limit){
                                int temp = arr[k];
                                arr[k] = arr[j];
                                arr[j] = temp;
                            }
                            else{
                             if (!used){
                                int temp = arr[k];
                                arr[k] = arr[j];
                                arr[j] = temp;
                                used  = true;
                             }
                             else{
                                no_exchange = true;
                             }
                             System.out.println(k + " " + j + " " + arr[k] + " " + arr[j]);
                            }
                            break;
                        }

                    }
                }
            }
            if (no_exchange) System.out.println("-1");
            else if (used) System.out.println("1");
            else System.out.println("0");
           System.out.println(Arrays.toString(arr));
        }
         in.close();
    }
}
