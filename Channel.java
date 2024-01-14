import java.util.Scanner;

public class Channel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a = in.nextInt();
            int q = in.nextInt();
            String s = in.next();
            int sum1 = a ,sum2 = a;
            boolean check = false;
            if (a == n) System.out.println("YES");
            else{
                for(int i = 0 ; i < q ; i++){
                if (s.charAt(i) == '+'){
                    sum1++; // old subsriber came online
                    sum2++; //  evry time new subscriber came online
                }
                else{
                    sum1--; // old subscriber went
                }
                if (!check){
                    check = sum1 >= n ? true : false;
                }
            }
            if (sum2 >= n){
                if (check){
                    System.out.println("YES");
                }
                else{
                    System.out.println("MAYBE");
                }

            }
            else{
                System.out.println("NO");
            }
        }
            }
            in.close();
    } 
}
