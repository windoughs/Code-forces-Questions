import java.util.Scanner;

public class ARaisingBacteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        int c = 0;
        while((x/2) != 0){
            if (x % 2 == 1) c++;
            x = x / 2;
        }
        System.out.println(c+1);
        in.close();

    }
}
