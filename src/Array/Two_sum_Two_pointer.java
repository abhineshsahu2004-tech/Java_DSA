package Array;
import java.util.Arrays;

public class Two_sum_Two_pointer {
    static int[] Twosum(int[] arr,int k){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if (arr[i]+arr[j]==k){
                return new int[]{i,j};
            } else  if (arr[i]+arr[j]>k){
                j--;
            } else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(Twosum(arr,6)));
    }
}
