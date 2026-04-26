package Array;

public class largest_third {
    static void main(String[] args) {
        int [] nums={1,2,5,2,8,2,1,1,2,0,6};
        int n=nums.length;
        long largest=Long.MIN_VALUE;
        long sec_largest=Long.MIN_VALUE;
        long third_largest=Long.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(largest<nums[i] ){
                third_largest=sec_largest;
                sec_largest=largest;
                largest=nums[i];
            }else if (sec_largest<nums[i]  &&  nums[i]!=largest ){
                third_largest=sec_largest;
                sec_largest=nums[i];
            }else if(third_largest<nums[i] &&  nums[i]!=largest  &&  nums[i]!=sec_largest){
                third_largest=nums[i];
            }
        }
        if(third_largest==Long.MIN_VALUE){
            third_largest=largest;
        }
        System.out.println(third_largest);
    }
}
