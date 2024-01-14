import java.util.Scanner;

public class BrainsPhotots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Character[][] arr = new Character[n][m];
        boolean check = true;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = in.next().charAt(0);
                if ((arr[i][j] != 'W' && arr[i][j] != 'B') && (arr[i][j] != 'G') )check = false;
            }
        }
        if(check) System.out.println("#Black&White");
        else System.out.println("#Color");
        in.close();
    }
}
