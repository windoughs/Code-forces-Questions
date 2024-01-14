import java.util.Scanner;

public class BoringAppartments {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-- > 0){
        int n = in.nextInt();
        int len = String.valueOf(n).length();
        int ans = ((n%10)-1)*10 + ( len * (len+1))/2;
        System.out.println(ans);
    }
    in.close();
   }
}
