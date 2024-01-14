import java.util.Scanner;

public class AntonAndDainik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0 , d = 0;
            int n = in.nextInt();
            String s = in.next();
            for(int i = 0 ; i < n ; i++){
                if (s.charAt(i) == 'A') a++;
                else d++;
            }
            if (a > d) System.out.println("Anton");
            else if (d > a) System.out.println("Danik");
            else System.out.println("Friendship");
        in.close();
    }
}
