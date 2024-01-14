import java.util.Arrays;
import java.util.Scanner;

public class BSortTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        long[] my = new long[n];
        for(int i = 0 ; i < n ; i++){
             arr[i] = in.nextLong();
             my[i] = arr[i];
        }
        Arrays.sort(my);
        int j = 0 ,start = 1 , end = 1;
        boolean found = false , ans = true;
        while(j < n){
            if (arr[j] != my[j]){
                if (!found){ // not matching index
                    long prev = arr[j];
                    start = j + 1;
                     for(int k = j ; k < n ; k++){
                        if (arr[k] > prev){ // descending order breaks
                            break;
                        }
                        prev = arr[k];
                        j++;
                    }
                    end = j;
                    found = true;
                }
                else { // when indices differ nore than once;
                    ans = false;
                    break;
                }
            }
            else j++;
        }
        if (ans) {
            System.out.println("yes");
            System.out.println(start + " " + end);
        }
        else System.out.println("no");
        in.close();
    }
}
