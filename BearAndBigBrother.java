import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a == b)  System.out.println(1);
        else{
            int c = 0;
            while(a <= b){
                a = a * 3;
                b = b * 2;
                c++;
            }
            System.out.println(c);
            
        }
        in.close();
    } 
}
