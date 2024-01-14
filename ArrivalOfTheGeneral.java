import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = 0 , min = 1000,max_ind = 0 , min_ind = 0;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
            if(arr[i] >  max) {
                max = arr[i];
                max_ind = i;
            }
            if(arr[i] <= min){
                 min = arr[i];
                 min_ind = i;
            }
        }
        int ans = Math.abs(max_ind - 0) + Math.abs(n - 1 - min_ind);
        if (max_ind > min_ind) ans--;
        System.out.println(ans);
        in.close();

    }
}
