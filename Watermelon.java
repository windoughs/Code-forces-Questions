

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String ans = n != 2 && n % 2 == 0 ? "YES" : "NO";
	System.out.println(ans);
	in.close();
}
}
