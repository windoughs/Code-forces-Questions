import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , c = 0;
        int[] my = new int[n];
        int[] arr = new int[5];
        for(int i = 0 ; i < n ; i++){
             my[i] = in.nextInt();
            arr[my[i]]++;
        }
        c = c + arr[4];
        c = c + arr[3];
       if (arr[3] != 0){
         if (arr[1] >= arr[3]) arr[1] -= arr[3];
        else if (arr[1] < arr[3] && arr[1] != 0) arr[1] = 0;
       }
        if (arr[2] % 2 == 0) c = c + (arr[2] / 2);
        else {
            c = c + (arr[2] / 2) + 1;
            if (arr[1] == 1) arr[1] -= 1;
            else if (arr[1] >= 2) arr[1] -= 2;
        }
        int add = (arr[1] % 4 == 0) ? arr[1] / 4 : (arr[1] / 4) + 1;
        c = c + add;
        System.out.println(c);
        in.close();
    }
}
