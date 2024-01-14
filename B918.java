import java.util.Scanner;

public class B918 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String[] arr = new String[3];
            for(int i = 0 ; i < 3 ; i++){
                arr[i] = in.next();
            }
            for(int j = 0 ; j < 3 ; j++){
                String s = arr[j];
                int ind = s.indexOf('?');
                if(ind != -1){
                    if(s.indexOf("A") == -1) System.out.println("A");
                    else if(s.indexOf("B") == -1) System.out.println("B");
                    else System.out.println("C");
                    break;
                }
            }

        }
    }
}
