import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BREstoreTheWEatherToDo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
        //long k = in.nextLong();
        long[] a = new long[n];
        ArrayList<Long> b = new ArrayList<>();
        for(int i = 0 ; i < n ;i ++){
            a[i] = in.nextLong();
        }
        for(int j = 0 ; j < n ; j++){
            long use = in.nextLong();
            b.add(use);
        }
        Collections.sort(b);
        long[] ans = new long[n];
        for(int o = 0 ; o < n ; o++){
            int[] my = BinarySearch(b,a[o]);
            long x = 0 , y = 0;
            if (my[0] < b.size()) x = b.get(my[0]);
            if(my[1] < b.size()) y = b.get(my[1]);
            long min = x < y ? x : y;
            ans[o] = min;
            b.remove(ans[o]);
        }
        }
        in.close();
    }
    public static int[] BinarySearch(ArrayList<Long> b , long target){
        int s = 0;
        int e = b.size() - 1;
        int[] ans = {0,0};
        while(s <= e){
            int mid = e - (s + e)/2;
            if(b.get(mid) == target){
                ans[0] = mid;
                ans[1] = mid;
                return ans;
            }
            else if (b.get(mid) < target) s++;
            else e--;
        }
        ans[0] = s;
        ans[0] = e;
        return ans;
    }
}
