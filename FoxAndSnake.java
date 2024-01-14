import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = 1 , use = 1;
        while(use <= n){
            if (use % 2 == 0){
                if (c % 2 != 0){
                    for(int j = 0 ; j < (m - 1) ; j++) System.out.print(".");
                    System.out.print("#");
                    System.out.println();
                }
                else{
                    System.out.print("#");
                    for(int k = 0 ; k < (m - 1) ; k++) System.out.print(".");
                    System.out.println();
                }
                c++;
            }
            else {
                for(int i = 0 ; i < m ; i++) System.out.print("#");
                System.out.println();
            }
            use++;
        }
        in.close();
    }
}
