import java.util.Scanner;

public class DesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n / 2;
        int b = n - a;
        while(true){
            boolean ans1 = CheckComposite(a);
            boolean ans2 = CheckComposite(b);
            if (ans1 && ans2) break;
            a--;
            b++;
        }
        System.out.println(a + " "  + b);
        in.close();
    }
    public static boolean CheckComposite(int n){
        for(int i = 2 ; i <= (n / 2) ; i++){
            if (n % i == 0){
                 return true;
            }
        }
        return false;
    }
}
