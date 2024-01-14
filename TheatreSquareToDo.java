

import java.util.*;

public class TheatreSquareToDo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
        long required = (n * m);
        long FlagStone = (a * a);
        if (required % FlagStone == 0) {
            System.out.println(required / FlagStone);
        }
        else{
            long c = ((n / a) + 1) + (m / a) + (n / a) + (((m/a) + 1 - 2) * (n / a));
            System.out.println(c);
        }
        in.close();
    }
}
