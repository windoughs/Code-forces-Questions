import java.util.Scanner;

public class BDrinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
            sum = sum + (arr[i]/(100.0));
        }
        System.out.format("%.12f" , (sum/n) * 100);
        in.close();
    }
}
