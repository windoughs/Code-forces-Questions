import java.util.Scanner;

public class MorningSandwich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int b = in.nextInt();
            int c = in.nextInt();
            int h = in.nextInt();
            int layers = 1;
            b--;
            while(b > 0 && c > 0){
                layers += 2;
                b--;
                c--;
            }
            while(b > 0 && h > 0){
                layers += 2;
                b--;
                h--;
            }
            System.out.println(layers);
        }
        in.close();
    }
}
