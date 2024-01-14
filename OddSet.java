import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-- > 0){
        int n = in.nextInt();
        n = n * 2;
        int odds = 0 , evens = 0;
        while(n-- > 0){
        int x = in.nextInt();
        if (x % 2  ==0 ) evens++;
        else odds++;
        }
        if (evens == odds) System.out.println("Yes");
        else System.out.println("No");
    }
    
    in.close();
    }
}
