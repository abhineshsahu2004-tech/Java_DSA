package Array;
import java.util.*;

public class Maximum_length_sum_k_negative_sign {
    static int Mslk(int [] arr,int k){
        HashMap<Integer,Integer> H=new HashMap<>();
        int n=arr.length;
        int length=0;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                length= Math.max(length,i+1);
            }
            if (!H.containsKey(sum)){
                H.put(sum,i);
            }
            if (H.containsKey(sum-k)){
                length=Math.max(length,i-(H.get(sum-k)));
            }
        }
        return length;
    }
    static void main(String[] args) {
        int []arr={1,5,3,4,6,2,1,4};
        System.out.println(Mslk(arr,13));
    }
}