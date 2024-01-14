import java.util.Scanner;

public class FootBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String t = "";
        int first = 0 , second = 0;
        n = n -1;
        first++;
        while(n-- > 0){
            String x = in.next();
            if (x.equals(s)) first++;
            else {
                second++;
                t = x;
            }
        }
        if (first > second) System.out.println(s);
        else System.out.println(t);
        in.close();
        
    }
}
