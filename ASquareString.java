import java.util.Scanner;

public class ASquareString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            if (s.length()% 2 != 0){
                System.out.println("NO");
            }
            else{
                int f = 0 , l = s.length()/2;
                boolean check = true;
                while(l < s.length()){
                    if (s.charAt(f) != s.charAt(l)){
                        check = false;
                        break;
                    }
                    f++;
                    l++;
                }
                if (check) System.out.println("YES");
                else System.out.println("NO");

            }
        }
        in.close();
    } 
}
