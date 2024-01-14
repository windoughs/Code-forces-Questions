import java.util.Scanner;

public class DEraser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0){
            int n = in.nextInt();
            int  k = in.nextInt();
            String s = in.next();
            int ind = 0 , c = 0;
            while(ind < n ){
                if (s.charAt(ind) == 'B'){
                    ind = ind + k;
                    c++;
                }
                else ind++;
            }
            System.out.println(c);
        }
        in.close();
    }
}
