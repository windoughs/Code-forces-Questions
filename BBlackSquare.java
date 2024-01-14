import java.util.Scanner;

public class BBlackSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int four = in.nextInt();
        String s = in.next();
        int[] arr = new int[5];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i)-48]++;
        }
        System.out.println(one * arr[1] + two * arr[2] + three * arr[3] + four * arr[4]);
        in.close();
    }
}
