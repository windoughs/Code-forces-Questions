import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int a = 0 , b = 0;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j  < 5 ; j++){
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(Math.abs(a - 2) + Math.abs(b - 2));
        in.close();;
    }
}
