//package Main;
import java.util.*;
//import java.io.*;
public class Ateam{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        while(n-- > 0){
            int p = in.nextInt();
            int v = in.nextInt();
            int t = in.nextInt();
            if ( ((p == 1 && v == 1) || (t == 1 && v == 1) ) || (p == 1 && t == 1)) c++;
        }
        System.out.println(c);

        in.close();
    }
}