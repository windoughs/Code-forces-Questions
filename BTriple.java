import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BTriple{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            HashMap<Integer , Integer > map = new HashMap<>();
            int ans = -1;
            for(int i = 0 ; i < n ; i++ ){
                int num = in.nextInt();
                if(map.containsKey(num)){
                    int k = map.get(num);
                    map.put(num , k + 1);
                }
                else map.put(num,1);
            }
            //  System.out.println(map);
            for (Map.Entry<Integer, Integer> set : map.entrySet()){
                if (set.getValue() >= 3){
                    ans = set.getKey();
                    break;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}