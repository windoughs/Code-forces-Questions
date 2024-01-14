import java.util.Scanner;

public class AErasingZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int c = 0;
            int ind = 0;
            while(ind < s.length()){
                if(s.charAt(ind) == '1'){
                    ind++;
                    int d = 0 ;
                    boolean flag = false;
                    while(ind < s.length() && s.charAt(ind) == '1'){
                        ind++;
                    }
                    while(ind < s.length() && s.charAt(ind) == '0'){
                        ind++;
                        d++;
                    }
                    while(ind < s.length() && s.charAt(ind) == '1'){
                        ind++;
                        flag = true;
                    }
                    if (flag) {
                        c += d;
                        ind--;
                    }
                }
                else ind++;
                
            }
            System.out.println(c);
        }
        in.close();
    }
}
