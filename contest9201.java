import java.util.*;
public class contest9201
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t  = in.nextInt();
		while(t-- > 0){
		    int n = in.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = in.nextInt();
		    }
		    Arrays.sort(arr);
		    int a = arr[0];
		    int b = arr[n-1];
		    int c1 = 0 , c2 = 0;
		    boolean flag = false;
		    for(int j = 0 ; j < n ; j++){
		        if (arr[j] == a) c1++;
		        else if (arr[j] == b) c2++;
		        else {
		            flag = true;
		            break;
		        }
		    }
		    if (flag) {
		        System.out.println("No");
		    }
		    else{
		        if (c1 == n/2 && c2 == n/2){
		            System.out.println("Yes");
		        }
		        else if (c1 == n/2 && c2 == (n/2)+1){
		            System.out.println("Yes");
		        }
		        else if (c2 == n/2 && c1 == (n/2)+1){
		            System.out.println("Yes");
		        }
		        else if(a == b){
		            System.out.println("Yes");
		        }
		        else {
		            System.out.println("No");
		        }
		    }
		    
		}
        in.close();
	}
}
