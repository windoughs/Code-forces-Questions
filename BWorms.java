import java.util.Scanner;

public class BWorms{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long[] my = new long[1000001];
        int c = 1 , pile = 1;
        while(n-- > 0){
            int a = in.nextInt();
            while(a-- > 0){
                my[c] = pile;
                c++;
            }
            pile++;
        }
       // System.out.println(Arrays.toString(my));
       int m = in.nextInt();
       int[] arr = new int[m];
       for(int i = 0 ; i < m ; i++){
            arr[i] = in.nextInt();
       }
       for(int j = 0 ; j < m ; j++) System.out.println(my[arr[j]]);
       in.close();

    }
}