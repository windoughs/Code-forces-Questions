import java.util.Scanner;

public class A1325{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long x = in.nextLong();
            long num1 = x / 2;
            long num2 = x  - num1;
            while(num1 > 0){
              long p = gcd(num1, num2);
              long q = LCM(num1 , num2);
              if (p + q == x){
                System.out.println(p + " " + q);
                break;
              }
              num1--;
              num2 = x  - num1;
            }
        }
        in.close();
    }
    public static long gcd(long a, long b) 
    { 
      if (a == 0) 
        return b; 
      return gcd( b % a , a);  
    } 
    public  static long LCM(long u, long v)
    {
        return (u / gcd(u, v)) * v;
    }
}