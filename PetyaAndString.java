import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        boolean found = false;
        for(int i = 0 ; i < a.length() ; i++){
            char ch1 =  a.charAt(i);
            char ch2 = b.charAt(i) ;
            if ( ch1 != ch2 ){
                int check1 = 0 , check2 = 0;
                if (ch1 >= 65 && ch1 <= 90) check1 = ch1 - 64;
                else check1 = ch1 - 96;
                if (ch2 >= 65 && ch2 <= 90) check2 = ch2 - 64;
                else check2 = ch2 - 96;
                if (check1 > check2){
                    System.out.println("1");
                    found = true;
                    break;
                }
                else if (check2 > check1){
                    System.out.println("-1");
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("0");
        in.close();
    }
}
