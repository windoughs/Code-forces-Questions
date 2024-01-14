import java.util.Scanner;

public class CMoveBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            int c = 0;
            for(int i = 0 ; i < n ; i++){
                if (s.charAt(i) == '('){
                    int ind = s.indexOf(')', i);
                    if (ind != - 1){
                        s = s.substring(0, i) + "0" + s.substring(i+1);
                        s = s.substring(0, ind) + "0" + s.substring(ind+1);

                    }
                    else {
                        c++;
                        s = s.substring(0, i) +  s.substring(i+1) + "(";
                    }
                }
            }
        }
    }
}
