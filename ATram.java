import java.util.Scanner;

public class ATram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int capacity = 0;
        while(n-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            capacity -= a;
            capacity +=b;
            if (capacity > max) max = capacity;

        }
        System.out.println(max);
        in.close();
    }
}
