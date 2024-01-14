import java.util.ArrayList;
import java.util.Scanner;

public class ADragons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        boolean ans = true;
        while(n-- > 0){
            int x = in.nextInt();
            int y = in.nextInt();
            if (x >= s){
            ArrayList<Integer> use = new ArrayList<>();
            use.add(x);
            use.add(y);
            list.add(use);
            }
            else s = s + y;
        }
        while(list.size() != 0){
            int  check = Remove(list , s);
            if (check == -1) {
                ans = false;
                break;
            }
            else s = s + check;
        }
        if (ans) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
    public static int Remove(ArrayList<ArrayList<Integer>> list , int s){
        for(int i = 0 ; i < list.size() ; i++){
            int pow = list.get(i).get(0);
            if (s > pow){
                int add = list.get(i).get(1);
                list.remove(i);
                return add;
            }
        }
        return -1;
    }
}
