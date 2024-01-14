


import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        for(int j = 0 ;j < n ; j++){
            if (arr[j] >= arr[k - 1] && arr[j] != 0) c++;
        }
        System.out.println(c);
        in.close(); 
    }
}
