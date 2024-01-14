import java.util.Scanner;

public class SerejaAndDeema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = in.nextInt();
        int s = 0 , e = n - 1;
        int serej = 0 , dima = 0 , use = 1;
        while (s <= e){
            if (use % 2 != 0){
                if (arr[s] > arr[e] ) {
                serej += arr[s];
                s++;
                }
                else {
                serej += arr[e];
                e--;
                }
            }
            else{
                if (arr[s] > arr[e] ) {
                dima += arr[s];
                s++;
                }
                else {
                dima += arr[e];
                e--;
                }
            }
            use++;
        }
        System.out.println(serej + " " + dima);
        in.close();
    }
}
