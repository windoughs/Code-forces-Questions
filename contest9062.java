import java.util.*;
public class contest9062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            String s = in.next();
            String t = in.next();
            boolean isTgood = true;
            boolean isSgood = true;
            for(int i = 0 ; i < t.length() - 1 ; i++){
                if (t.charAt(i) == t.charAt(i + 1)){
                    isTgood = false;
                    break;
                }
            }
            for(int j = 0 ; j < s.length() - 1 ; j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    if (isTgood){
                        if (s.charAt(j) == t.charAt(0) || s.charAt(j) == t.charAt(m-1)){
                            isSgood = false;
                            break;
                        }
                    }
                    else{
                        isSgood = false;
                        break;
                    }
                }
            }
            if(isSgood) System.out.println("YES");
            else System.out.println("NO");


        }
        in.close();

    }
}
