import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        int ind = 0 , c = 0;
        while(n-- > 0){
            arr[ind][0] = in.nextInt();
            arr[ind][1] = in.nextInt();
            ind++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            int host_color = arr[i][1];
            for(int j = 0 ; j < arr.length ; j++){
                int home_color = arr[j][0];
                if (home_color == host_color) c++;
            }
        }
        System.out.println(c);
        in.close();
    }
}
