import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height = 0 , cubes = 1 , use = 1;
        while(true){
            if (n >= cubes){
                height++;
                n = n - cubes;
            }
            else break;
            use++;
            cubes += use;
        }
        System.out.println(height);
        in.close();
    }
}
