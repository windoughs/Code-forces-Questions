import java.util.Arrays;
import java.util.Scanner;

public class NewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] arr = {a , b , c};
        Arrays.sort(arr);
        System.out.println(arr[1] - arr[0] + arr[2] - arr[1]);
        in.close();
    }
}
