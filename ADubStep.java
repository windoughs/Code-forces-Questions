import java.util.Scanner;

public class ADubStep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 0;
        int ind = 0;
        String ans = "";
        while(ind < s.length()){
            if ((ind + 2 ) < s.length() && s.substring(ind, ind + 3).equals("WUB")){
                 ind = ind + 3;
                 if (c == 0) ans = ans + " ";
                 c++;
            }
            else{
                ans = ans + String.valueOf(s.charAt(ind));
                c = 0;
                ind++;
            }
        }
        System.out.println(ans.trim());
        in.close();
    }
}
