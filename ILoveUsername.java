import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0] , min = arr[0] ,c = 0;
        for(int j = 1 ; j < n ; j++){
            if (arr[j] > max){
                max = arr[j];
                c++;
            }
            else if (arr[j] < min){
                min = arr[j];
                c++;
            }
        }
        System.out.println(c);
        in.close();
    }
}
