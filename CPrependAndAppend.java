import java.util.Scanner;

public class CPrependAndAppend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String str = in.next();
            int s = 0 , e = n - 1;
            int ans = 1;
            while(s <= e){
                if(str.charAt(s) == str.charAt(e)){
                    break;
                }
                s++;
                e--;
            }
            System.out.println((e-s)+ans);
        }
        in.close();
    }
}
