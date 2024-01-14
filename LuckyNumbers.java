import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean check = false;
        int digits = String.valueOf(n).length();
        if (digits == 1){
            if (n % 4 == 0 ||  n % 7 == 0) check = true;
        }
        else if (digits == 2){
            int[] arr1 = {4,7,44,77,47,74};
        for(int j  = 0 ; j < arr1.length ; j++){
            if (n % arr1[j] == 0) {
                check = true;
                break;
            }
        }
    }
    else{
        int[] arr = {4,7,44,77,47,74,477,444,744,774,777};
        for(int i  = 0 ; i < arr.length ; i++){
            if (n % arr[i] == 0) {
                check = true;
                break;
            }
        }
    }
        if (check) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
}
