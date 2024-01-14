import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int[] arr = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90){
                arr[ch - 65]++;
            }
            else arr[ch - 97]++;
        }
        //System.out.println(Arrays.toString(arr));
        boolean check = true;
        for(int j = 0 ; j < 26 ; j++){
            if(arr[j] == 0) {
                check = false;
                break;
            }            
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
        in.close();

    }
}
