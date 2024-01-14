import java.util.Scanner;

public class DislikesOfThreeToDo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0 ){
            int k = in.nextInt();
            int i = 1;
            int ans = 0 , a = 1;
            while(true){
                if (i > k) break;
                if (a % 3 == 0 || a % 10 == 3){
                    ans = a + 1;
                }
                else {
                    ans += 1;
                    i++;
                }
                a++;
            }
            System.out.println(k + " "  + ans);
        }
        in.close();
    }
}
