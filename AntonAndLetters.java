import java.util.ArrayList;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 1 ; i < s.length() ; i = i + 3){
                if (!list.contains(s.charAt(i))){
                    list.add(s.charAt(i));
                }
            
        } 
        if (s.length() == 2) list.clear();
        System.out.println(list.size());
        in.close();
    }
}
