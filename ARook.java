import java.util.Scanner;

public class ARook{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ind = 1;
        while(ind <= 8){
            if(ind != (s.charAt(1)- 48)){
                System.out.println(s.charAt(0)+String.valueOf(ind));
            }
            ind++;
        }
        // char ch = 97;
        // while(ch <= 105){
        //     if(ch != s.charAt(1)){
        //       System.out.println(ch+String.valueOf(s.charAt(1)));  
        //     }

        // }
    }
}