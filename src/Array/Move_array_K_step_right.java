package Array;

import static Array.Print_array_.print;

public class Move_array_K_step_right {
    public static void Reverse(int[] arr, int i,int j){
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        Reverse(nums , 0 , n-1);
        Reverse(nums , 0 , k-1);
        Reverse(nums , k , n-1);
    }
    static void main(String[] args) {
         int[] Array={1,2,3,4,5,6,7};
         rotate(Array,3);
         print(Array);
  }
}