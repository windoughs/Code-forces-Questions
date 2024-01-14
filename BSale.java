import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        int j = 0;
        while(j < list.size() && m > 0){
           ans +=  list.get(j);
           j++;
           m--;
        }
        
        System.out.println(-1*ans);
        in.close();

    }
}
