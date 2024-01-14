import java.util.*;
public class KeepItBeautiful
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
		    int q = in.nextInt();
		    long[] arr = new long[q];
		    String ans  = "";
		    for(int i = 0 ; i < q ; i++){
		        arr[i] =  in.nextLong();
		    }
		    ArrayList<Long> list = new ArrayList<>();
		    for(int j = 0 ; j < q ; j++){
		        boolean check = AppendOrNot( list , arr[j]);
		        if (check) {
		            ans = ans + "1";
		            list.add(arr[j]);
		        }
		        else ans = ans + "0";
		    }
		    System.out.println(ans);
            
		    
	}
	in.close();
	
		
	}
	public static boolean AppendOrNot( ArrayList<Long> list,  long num){
	    for(int k = 0 ; k < list.size() - 1 ; k++){
	        if (num > list.get(k) && num < list.get(k + 1) ) return false;
	    }
	    return true;
	}
}
