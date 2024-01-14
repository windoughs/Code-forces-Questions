import java.util.*;

public class D918 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            String[] arr = new String[2*n];
            int ind = 0;
            for(int i = 0 ; i < n ; i++){
            arr[ind] = String.valueOf(s.charAt(i));
            arr[ind+1] = "$";
            ind += 2;
            }
            for(int i = 0 ; i < n - 2 ;i++){
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e'){
                    char ch2 = s.charAt(i+2);
                    if((ch2 == 'b' || ch2 == 'd') || ch2 == 'c'){
                        //CVCC
                        arr[2*(i+1) + 1] = ".";
                    }else{
                        //CV
                       arr[(2*i) + 1] = ".";
                    }
                }
            }
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < 2 * n; i++) {
                if (!arr[i].equals("$")) {
                    answer.append(arr[i]);
                }  
            }
            String ans = answer.toString();
            System.out.println(ans);
        }
    }
}
