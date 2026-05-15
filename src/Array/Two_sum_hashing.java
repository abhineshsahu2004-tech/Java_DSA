package Array;
import java.util.*;

public class Two_sum_hashing {
    static int[]  Twosum(int[] arr,int k){
        HashMap <Integer,Integer> H=new HashMap<>();
        int n=arr.length;
        for (int i=0;i<n;i++){
            int needed=k-arr[i];
            if(H.containsKey(needed)){
               return new int[] {H.get(needed),i};
            }
            H.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    static void main(String[] args) {
        int [] arr={1,2,4,3};
        System.out.println(Arrays.toString(Twosum(arr,6)));
    }
}
