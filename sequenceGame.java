import java.util.ArrayList;
import java.util.Scanner;

public class sequenceGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] b = new long[n];
            for(int i = 0 ; i  < n ; i++){
                b[i] = in.nextLong();
            }
            ArrayList<Long> a = new ArrayList<>();
            a.add(b[0]);
            for(int i = 1 ; i < n ; i++){
                if (b[i] >= b[i-1]){
                    a.add(b[i]);
                }
                else{
                    a.add(b[i]);
                    a.add(b[i]);
                }
            }
            System.out.println(a.size());
            for(int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(j) + " ");
            }
        }
        in.close();
    }
}
