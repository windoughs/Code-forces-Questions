import java.util.*;
public class BuildingAnAqua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long x = in.nextInt();
            long[] arr = new long[n];
            long ans = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextLong();
    
            }
            long s = 0 , e = 1000000000;
            while(s <= e){
                long mid = s + (e - s)/2;
                long check = Vol(arr, mid);
                if(check <= x){
                    ans = mid;
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
            System.out.println(ans);


        }
        in.close();
    }

    public static long Vol(long[] arr , long h){
        long water_store = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (h > arr[i]){
                water_store += (h - arr[i]);
            }
        }
        return water_store;
    }

}
