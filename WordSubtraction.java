import java.util.Scanner;

public class WordSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        int k = in.nextInt();
        while(k-- > 0){
            long last = n % 10;
            if (last == 0) n = n / 10;
            else n--;
        }
        System.out.println(n);
        in.close();
    }
}
