package Array;
import java.util.Scanner;

public class Maximum_sum_subarray_of_k_length {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,10,6,7,3};
        int n=arr.length;
        int k=3;
        int sum=0;
        int max=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=Math.max(sum,max);
        for (int i=0;i<n-k;i++){
            sum+=arr[i+k]-arr[i];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}