import java.util.Arrays;
import java.util.Scanner;
 
public class BInterestingDrinks{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
        int q = in.nextInt();
        Arrays.sort(arr);
        while(q-- > 0){
            long m = in.nextInt();
            if (m < arr[0]) System.out.println(0);
            else{
                 int my = BS(arr,m);
                System.out.println(my+1);
            }
        }
        in.close();
    }
    public static int BS(int[] arr , long target){
        int s = 0 ; 
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if (arr[mid] <= target) s = mid + 1;
            else e = mid - 1;
        }
        return e;
    }
}