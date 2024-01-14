import java.util.Scanner;

public class CTeranaryXorDo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int num = in.nextInt();
            String num1 = "" , num2 = "";
            while(num > 0){
                int rem = num % 10;
                if (rem == 2){
                    if (num1.compareTo(num2) > 0){
                        num1 = "0" + num1;
                        num2 = "2" + num2;
                    }
                    else if (num1.compareTo(num2) < 0){
                        num1 = "2" + num1;
                        num2 = "0" + num2;
                    }
                    else{
                        num1 = "1" + num1;
                        num2 = "1" + num2;
                    }
                }
                else if (rem == 1){
                    if (num1.compareTo(num2) < 0){
                        num1 = "1" + num1;
                        num2 = "0" + num2;
                    }
                    else{
                        num1 = "0" + num1;
                        num2 = "1" + num2;
                    }
                }
                else {
                    num1 = "0" + num1;
                    num2 = "0" + num2;
                }

               num =  num / 10;
            }
            System.out.println(num1 + " " + num2);
        }
    }
    
}