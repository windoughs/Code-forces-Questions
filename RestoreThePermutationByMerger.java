import java.util.ArrayList;
import java.util.Scanner;

public class RestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[2*n];
            for(int i = 0 ; i < (2*n) ; i++) arr[i] = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < (2*n) ; j++){
                if(!list.contains(arr[j])){
                    list.add(arr[j]);
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
