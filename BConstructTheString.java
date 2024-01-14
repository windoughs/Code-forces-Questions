import java.util.Scanner;

public class BConstructTheString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int i = 0;
            char use = 'a';
            String ans = "";
            if (a == 1 && b == 1){
                while(i <  n){
                char ch = Increase(use);
                ans += String.valueOf(ch);
                i++;
                use++;
                }
            }
            else{
                while(i < n){
                    int j = 0;
                    char c = use;
                    while(j < b && i < n){
                        char ch = Increase(c);
                        ans += String.valueOf(ch);
                        i++;
                        j++;
                        c++;
                    }
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
    public static char Increase(char ch){
        if (ch + 1 <= 'z') ch++;
        else ch = 'a';
        return ch;

    }
}
