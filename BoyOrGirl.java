import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            if (!list.contains(s.charAt(i))) list.add(s.charAt(i));
        }
        if (list.size() % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
        in.close();
    }
}
