import java.util.Scanner;

public class IQTest {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n  ; i++) arr[i] = in.nextInt();
    int a = arr[0] % 2 , b = arr[1] % 2;
    int ans = 1;
    if (a == 0 && b == 0){
        for(int j = 2 ; j < n ; j++){
            if (arr[j] % 2 != 0){
                ans = (j + 1);
                break;
            }
        }
    }
    else if (a != 0 && b != 0){
        for(int k = 0 ; k < n ; k++){
            if (arr[k] % 2 == 0){
                ans = k + 1;
                break;
            }
        }
    }
    else if (a == 0 && b != 0){
        ans = arr[2] % 2 == 0 ? 2 : 1;
    }
    else{
        ans = arr[2] % 2 == 0 ? 1 : 2;
    }
    System.out.println(ans);
    in.close();
   } 
}
