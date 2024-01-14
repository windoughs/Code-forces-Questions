import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
            if (arr[i] > h) c += 2;
            else c++;
        }
        System.out.println(c);
        in.close();
    }
}
