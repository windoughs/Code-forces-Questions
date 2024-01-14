import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            if (n == 5){
                int c = 0;
                boolean flagt = true , flagi = true , flagm = true , flagu = true , flagr = true;
                for(int i = 0 ; i < n ; i++){
                    char ch = s.charAt(i);
                if (ch == 'T' && flagt) {
                    flagt = false;
                    c++;
               }
                else if (ch == 'i' && flagi) {
                    c++;
                    flagi = false;
                }
                else if (ch == 'm' && flagm) {
                    c++;
                    flagm = false;
                }
                else if (ch == 'u' && flagu) {
                    c++;
                    flagu = false;
                }
                else if (ch == 'r' && flagr) {
                    c++;
                    flagr = false;
                }
                }
                if (c == 5) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        in.close();
    }
}
