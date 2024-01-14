import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            if (CheckRound(n))  {
                System.out.println(1);
                System.out.println(n);
            }
            else{
                PrintRound(n);
                System.out.println();
            }
        }
        in.close();
    }
    public static boolean CheckRound(int n){
        String s = String.valueOf(n);
        if (s.length() == 1) return true;
        while(n > 9){
            if (n % 10 != 0) return false;
            n = n / 10;
        }
        return true;
    }
    public static void PrintRound(int n){
        String s = String.valueOf(n);
        //System.out.println("I am in Print Round" + " " + s);
        String re = "";
        int c = 0;
        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) != '0'){
                re = re + String.valueOf(s.charAt(i));
                int use = s.length() - 1 - i;
                while((use) > 0){
                    re = re + "0";
                    use--;
                }
                c++;
                re = re + " ";
            }
        }
        System.out.println(c);
        System.out.print(re + " ");
    }
}
