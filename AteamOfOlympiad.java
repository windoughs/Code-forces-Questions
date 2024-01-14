import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AteamOfOlympiad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] my = new int[4];
       ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        ArrayList<Integer> threes = new ArrayList<>();
        for(int i = 0 ; i < n ;i++){
            arr[i] = in.nextInt();
            my[arr[i]]++;
            if (arr[i] == 1) ones.add(i+1);
            else if (arr[i] == 2) twos.add(i+1);
            else threes.add(i+1);

        }
        Arrays.sort(my);
        int w = my[1] , ind = 0;
        System.out.println(w);
        if (w !=0){
            while(w-- > 0){
    System.out.println(ones.get(ind)+ " " + twos.get(ind) + " " + threes.get(ind));
                ind++;
            }
        }
        in.close();
    }
}
