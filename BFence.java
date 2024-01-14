import java.util.Scanner;

public class BFence {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
    int ans_ind = 0;
    int min_sum = 0;
    int a = k;
    int ind = 0;
    while(a-- > 0){
        min_sum += arr[ind];
        ind++;
    }
    for(int j = 0 ; j < n ; j++){
        int use = k;
        int sum = 0;
        ind = j;
        while(use > 0 && ind < n){
            sum += arr[ind];
            // System.out.println(ind + " ind");
            ind++;
            use--;
            
        }
        // System.out.println(sum + " " + min_sum);
        if(sum < min_sum && use == 0){
             min_sum = sum;
             ans_ind = j;
        }
    }
    System.out.println(ans_ind);
    in.close();
   } 
}
