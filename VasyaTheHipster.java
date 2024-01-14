import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b){
            System.out.print(a + " " + ((b-a)/2));
        }
        else{
           System.out.print(b + " " + ((a-b)/2));
        }
        in.close();
    }
}
