import java.util.ArrayList;
import java.util.Scanner;

public class BHauntedHouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            String use = s;
            int num = 1;
            ArrayList<String> arr = new ArrayList<>();
            arr.add(s);
            while(true){
                boolean check = false;
                for(int i = 0 ; i < n - 1 ; i++){
                    if (s.charAt(i) == '0' && s.charAt(i + 1) == '1'){
                        String my = s.substring(0, i) + "10" + s.substring(i+2);
                        arr.add(my);
                        s = my;
                        check = true;
                    }
                }
                if(!check) break;
            }
            s = use;
            while(true){
                boolean check = false;
                for(int i = 0 ; i < n - 1 ; i++){
                    if (s.charAt(i) == '1' && s.charAt(i + 1) == '0'){
                        String my = s.substring(0, i) + "01" + s.substring(i+2);
                        arr.add(my);
                        s = my;
                        check = true;
                    }
                }
                if(!check) break;
            }
            System.out.println(arr);
            s = use;
            while(num <= n){
                int a = 1 << num;
                boolean ans = false;
                for(int i = 0 ; i < arr.size() ; i++){
                    if (Integer.parseInt(arr.get(i), 2) % a == 0){
                        int c = 0;
                        String str = arr.get(i);
                        for(int j = 0 ; j < n ; j++){
                            if(s.charAt(j) != str.charAt(j)) c++;
                        }
                        System.out.print((c/2) + " ");
                        // System.out.println(Integer.parseInt(arr.get(i), 2) + " " + a);
                        ans = true;
                        break;
                    }
                }
                if(!ans){
                    while(num <= n){
                       System.out.print("-1 ");
                       num++; 
                    }
                    break;
                }
                num++;
            }

        }
        
        in.close();
    }
}
