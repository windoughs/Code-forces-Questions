import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int i = 1 , c = 0 , rem = 240 - k , req = 5;
       // System.out.println(rem + " " + req);
        while(n-- > 0){
            if (rem >= (req)){
                rem = rem - req;
                c++;
               // System.out.println(rem + " " + " " + c + " " + req);
            }
            else break;
            i++;
            req = 5 * i;
        }
        System.out.println(c);
        in.close();
    }
}
