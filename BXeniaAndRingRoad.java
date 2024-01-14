import java.util.Scanner;

public class BXeniaAndRingRoad {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];
        for(int i = 0 ; i < m ; i++) arr[i] = in.nextInt();
        int current = 1 ;
        long t = 0;
        for(int j = 0 ; j < m ; j++){
            if (arr[j] > current ) t = t + (arr[j] - current);
            else if (arr[j] < current) t = t + (n - current) +  arr[j];
            current = arr[j];
        }
        System.out.println(t);
        in.close();
    }
}
