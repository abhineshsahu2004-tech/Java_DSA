package Array;

public class Find_All_Numbers_Disappeared_in_an_Array {
     static void main(String[] args) {
        int [] nums={2,6,7,2,2,3,1};
        int n=nums.length;
        int temp;
        for(int i=0;i<n;i++){
            temp=Math.abs(nums[i]);
            if((nums[temp-1])>0) {
                nums[temp - 1] = -1 * nums[temp - 1];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                System.out.print((i+1)+" ");
        }
    }
}
