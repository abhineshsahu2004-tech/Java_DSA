package Array;

import static Array.Print_array_.print;

public class Squares_of_sorted_array {
    static int[] Square_Sorted_Array(int [] arr){
        int n=arr.length;
        int l=0,r=n-1;
        int []result =new int[n];
        for(int i=n-1;i>=0;i--){
            if(arr[l]*arr[l]<=arr[r]*arr[r]){
                result[i]=arr[r]*arr[r];
                r--;
            }
            else {
                result[i]=arr[l]*arr[l];
                l++;
            }
        }
        return result;
    }
    static void main(String[] args) {
        int[] Array ={-4,-2,0,5,8};
        print(Square_Sorted_Array(Array));
    }
}
