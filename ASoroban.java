import java.util.Scanner;
public class ASoroban {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        String[] ans = {"O-|-OOOO","O-|O-OOO" , "O-|OO-OO","O-|OOO-O","O-|OOOO-","-O|-OOOO" , "-O|O-OOO","-O|OO-OO","-O|OOO-O","-O|OOOO-"};
        if (n == 0) System.out.println(ans[0]);
        else{
            while(n > 0){
             int ind = (int)(n%10);
             System.out.println(ans[ind]);
            n = n / 10;
            }
        }
        
        in.close();

    }
}
