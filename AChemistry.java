import java.util.Scanner;

public class AChemistry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            String str = in.next();
            int[] arr = new int[26];
            for(int i = 0 ; i < n ; i++){
                int ch = str.charAt(i) - 97;
                arr[ch]++;
            }
            for(int i = 0 ; i < 26 ; i++){
                if (arr[i] == 1 && k > 0){ // Remove all occurence of 1
                    arr[i] = 0;
                    k--;
                }
            }
            for(int i = 0 ; i < 26 ; i++){
                if (arr[i] % 2 != 0 && k > 0){ // Reduce all odd no.s by 1
                    arr[i]--;
                    k--;
                }
            }
            if(k > 0){
                for(int i = 0 ; i < 26 ; i++){
                    if (arr[i]  != 0 && k > 0){ // Reduce all even to 0
                        if (k > arr[i]){
                            k = k - arr[i];
                             arr[i] = 0;
                        }
                        else {
                            arr[i] = arr[i] - k;
                            k = 0;
                        }
                    }
                }   
            }
            boolean odd  = false;
            boolean ans = true;
            for(int j = 0 ; j < 26 ; j++){
                if (arr[j] % 2 != 0){
                   if (!odd) odd = true;
                   else {
                    ans = false;
                    break;
                   }
                }

            }
            if(ans) System.out.println("YES");
            else System.out.println("NO");


        }
        in.close();
    }
}
