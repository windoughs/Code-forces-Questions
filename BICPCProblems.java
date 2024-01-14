import java.util.Scanner;

public class BICPCProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            String s = in.next();
            int c = 0;
            //HashMap<String , Integer > map = new HashMap<>(); 
            String my = "";   
            for(int i = 0 ; i < n ; i++){
                String ch = String.valueOf(s.charAt(i));
                if(my.indexOf(ch) != -1){
                    c++;
                }
                else{
                    c += 2;
                }
                my += ch;
            }
            System.out.println(c);
        }
        in.close();
    }
}
