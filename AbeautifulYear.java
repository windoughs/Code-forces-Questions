import java.util.Scanner;

public class AbeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(true){
            n++;
            boolean check = DistinctDigits(n);
            if(check){
                System.out.println(n);
                break;
            }
        }
        in.close();
    }
    public static boolean DistinctDigits(int n){
        String my  = String.valueOf(n);
        for(int i = 0 ; i < my.length() ; i++){
            if(my.indexOf(my.charAt(i)) != my.lastIndexOf(my.charAt(i))) return false;
        }
        return true;
    }
}
