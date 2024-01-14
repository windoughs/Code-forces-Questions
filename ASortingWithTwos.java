import java.util.Scanner;

public class ASortingWithTwos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
            }
            boolean check = true;
            for(int j = 0 ; j < n - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    if ( (j + 1) % 2 != 0 && (j + 1) != 1){
                        check = false;
                        break;
                    }
                    else{
                        int num = j + 1;
                        boolean powOfTwo = true;
                        while (num > 0) {
                            if (num % 2 != 0 && num != 1){
                                powOfTwo = false;
                                break;
                            }
                            num = num / 2;
                        }
                        check = powOfTwo;
                        if(!check) break;
                    }
                }

            }
            if(check) System.out.println("YES");
            else System.out.println("NO");

        }
        in.close();
    }
}
