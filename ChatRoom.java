import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String my = "hello";
        for(int i = 0 ; i < s.length() ; i++){
            if (my.length() != 0 && s.charAt(i) == my.charAt(0)){
                my = my.substring(1);
            }
        }
        if (my.length() == 0) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
}
