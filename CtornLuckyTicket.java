import java.util.Scanner;

public class CtornLuckyTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] even = new int[n];
        int[] odd = new int[n];
        int[] arr = new int[n];
        int ind1 = 0, ind2 = 0;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
            if (String.valueOf(arr[i]).length() % 2 == 0){
                    even[ind1] = sum(arr[i]);
                    ind1++;
            }
            else{
                odd[ind2] = sum(arr[i]);
                    ind2++;

            }
        }
        int ans = n;
        for(int i = 0 ; i < ind1 ; i++){
            for(int j = i + 1 ; j < ind1 ; j++ ){
                if (even[i] == even[j]) ans += 2;
            }
        }
        for(int i = 0 ; i < ind2 ; i++){
            for(int j = i + 1 ; j < ind2 ; j++ ){
               if(odd[i] == odd[j]) ans += 2;
            }
        }
        System.out.println(ans);
        in.close();
        
    }
    public static int sum(int num){
        int s = 0;
        while(num > 0){
            s += (num % 10);
            num = num / 10;
        }
        return s;
    }
    public static boolean isLucky(String num){
        int n = num.length();
        if (n % 2 == 0){
            int sum1 = 0 , sum2 = 0;
            int s = 0 , m = n / 2;
            while(m < n ){
                sum1 += (num.charAt(s) - 48);
                sum2 += (num.charAt(m) - 48);
                s++;
                m++;
            }
            if (sum1 == sum2) return true;
            else return false;
        }
        return false;
    }
}
