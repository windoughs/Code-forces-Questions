import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long[] arr = {1,5,10,20,100};
        long c = 0;
        while (n > 0){
            long min = 1000000000 , div = 1;
            for(int i = 0 ; i < 5 ; i++){
                long use = n / arr[i];
                if (use < min && use != 0) {
                    min = use; 
                    div = arr[i];
                }
            }
            c = c + (min);
            n = n - (min * div);
        }
        System.out.println(c);
        in.close();
    }
}
