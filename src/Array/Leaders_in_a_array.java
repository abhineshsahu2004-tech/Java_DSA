package Array;
import java.util.*;

public class Leaders_in_a_array {
    static void main(String[] args) {
        int[] arr={2,5,7,1,5};
        System.out.println(leaders(arr));
    }
        public static List<Integer> leaders(int[] arr) {
            ArrayList<Integer> ans= new ArrayList<>();
            int n=arr.length;
            if(n==0){
                return ans;
            }
            int max=arr[n-1];
            ans.add(max);
            for(int i=n-2;i>=0;i--){
                if(arr[i]>=max){
                    max=arr[i];
                    ans.add(max);
                }
            }
            Collections.reverse(ans);
           return ans;
    }
}
