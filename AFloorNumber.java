import java.util.Scanner;

public class AFloorNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int x = in.nextInt();
            if (n < 3) System.out.println(1);
            else{
                int prev = 2;
                int floor = 2;
                while(true){
                    if ((prev+1) <= n && n <= (prev+x)){
                        System.out.println(floor);
                        break;
                    }
                    floor++;
                    prev = prev + x;
                }
            }
        }
        in.close();
    }
}
