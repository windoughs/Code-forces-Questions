import java.util.Scanner;

public class BBalancedArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            if ((n/2) % 2 == 0){
                System.out.println("YES");
                int add = 2 , add2 = 1;
                for(int i = 0 ; i < n ; i++){
                    if (i < n / 2){
                       System.out.print(add + " ");
                        add += 2;
                    }
                    else{
                        if (i == n - 1) System.out.print(n + (n / 2 - 1));
                        else System.out.print(add2 + " ");
                        add2 += 2;
                    }
                }
                System.out.println();
            }
            else System.out.println("NO");
            
            

        }
       
        in.close();
    }
}
