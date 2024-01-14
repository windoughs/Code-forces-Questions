import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
        Arrays.sort(arr);
        int c = 0;
        for(int j = 0 ; j < n - 2 ; ){
            boolean check = false;
            if ((arr[j] + k) <= 5 && (arr[j + 2] + k) <= 5) check = true;
            if (check){
                c++;
                j = j + 3;
            }
            else j++;

        }
        System.out.println(c);
        in.close();
    }
}
