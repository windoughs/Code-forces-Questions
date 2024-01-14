import java.util.Scanner;

public class Magnets {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c = 1 ;
    String s ;
    String prev = in.next();
    n = n - 1;
    while(n-- > 0){
         s = in.next();
         if (!s.equals(prev)) c++;
         prev = s;
    }
    System.out.println(c);
    in.close();
   } 
}
