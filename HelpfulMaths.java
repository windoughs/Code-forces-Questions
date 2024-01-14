import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != '+') list.add(s.charAt(i) - 48);
        }
        Collections.sort(list);
        for(int j = 0 ; j < list.size() ; j++){
            if (j != list.size()- 1) ans= ans + String.valueOf(list.get(j)) + "+";
            else ans= ans + String.valueOf(list.get(j)) ;
        }
        System.out.println(ans);
        in.close();
    }
}
