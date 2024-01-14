import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0 , c = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
            if (arr[i] > 0) sum += arr[i];
            else{
                if (sum > 0) sum -= 1;
                else c++;
            }
        }
        System.out.println(c);
        in.close();
    }
}
