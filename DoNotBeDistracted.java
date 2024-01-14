import java.util.Arrays;
import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            int[] arr = new int[27];
            boolean check = true;
            for(int i = 0 ; i < s.length() ; i++){
                if (arr[s.charAt(i) - 64] != 0 && s.charAt(i-1) != s.charAt(i)){
                    check = false;
                    break;
                }
               
                arr[s.charAt(i) - 64]++;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
