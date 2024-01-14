import java.util.Scanner;

public class GiftCarpet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            Character[][] arr = new Character[n][m];
            boolean ans = false;
            for(int i = 0 ; i < n ; i++){
                String s = in.next();
                for(int j = 0 ; j < m ;j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            boolean v = false , i = false , k =false, a = false;
            //check if vika exists or not
            for(int o = 0 ; o < m ; o++){
                int j = 0;
                boolean flag = true;
                while(j < n){
                    if (flag){
                        if(((arr[j][o] == 'v' && !i) && (!k && !a)) && (!v)){
                        v = true;
                        flag = false;
                    }
                    else if (((arr[j][o] == 'i' && v) && (!a && !k)) && (!i)){
                        i = true;
                        flag = false;
                    }
                    else if(((arr[j][o] == 'k' && i) && !a) && !k){
                        k = true;
                        flag = false;
                    }
                    else if(arr[j][o] == 'a' && k){
                        a = true;
                        flag = false;
                        ans = true;
                    }
                    }
                    j++;
                }
               
                
            }
            if (ans) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}
