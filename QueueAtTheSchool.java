import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next() , ans = ""  , use = "";
        while(t-- > 0){
            use = s;
            for(int i = 0 ; i < s.length() - 1 ; i++){
                if(use.charAt(i) == 'B' && use.charAt( i + 1) == 'G'){
                    s = s.substring(0, i) + "G" + "B" + s.substring(i + 2);
                }
            }
            ans = s;
        }
        System.out.println(ans);
        in.close();
    }
}
