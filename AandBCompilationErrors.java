import java.util.Arrays;
import java.util.Scanner;

public class AandBCompilationErrors{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        long[] a = new long[n-1];
        long[] b = new long[n-2];
        for(int i = 0 ; i < n ; i++) arr[i] = in.nextLong();
        for(int j = 0 ; j < n - 1 ; j++) a[j] = in.nextLong();
        for(int k = 0 ; k < n - 2 ; k++) b[k] = in.nextLong();
        Arrays.sort(arr);
        Arrays.sort(a);
        Arrays.sort(b);
        int ans1 = n - 1 , ans2 = n - 2;
        for(int i = 0 ; i < n - 1 ; i++){
            if(arr[i] != a[i]){
                ans1 = i;
                break;
            }
        }
        for(int j = 0 ; j < n - 2 ; j++){
            if(a[j] != b[j]){
                ans2 = j;
                break;
            }
        }
        System.out.println(arr[ans1]);
        System.out.println(a[ans2]);
        in.close();
    }
}