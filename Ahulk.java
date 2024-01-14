import java.util.Scanner;

public class Ahulk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int use = 0;
        String ans = "";
        if (n % 2 != 0){
            use = n - 1;
            while(use > 0){
                ans = ans + "I hate that I love that ";
                use = use - 2;
            }
            ans = ans + "I hate it";
        }
        else{
            use = n - 2;
            while(use > 0){
                ans = ans + "I hate that I love that ";
                use = use - 2;
            }
            ans = ans + "I hate that I love it";
        }
        System.out.println(ans);
        in.close();
    }
}
