import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int use;
        int[] arr = new int[n + 1];
        for(int i = 0 ; i < p ; i++) {
             use = in.nextInt();
            arr[use]++;
        }
        int q = in.nextInt();
        for(int j = 0 ; j < q ; j++){
            use = in.nextInt();
            arr[use]++;
        }
        boolean check = true;
        for(int k = 1 ; k < arr.length ; k++){
            if (arr[k] == 0){
                check = false;
                break;
            }
        }
        if(check) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
        in.close();
        
    }
}
