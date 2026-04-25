package Array;

public class largest_third {
    static void main(String[] args) {
        int [] nums={1,98,94,36,0,7,5,2};
        int n=nums.length;
        int largest=nums[0];
        int sec_largest=Integer.MIN_VALUE;
        int third_largest=Integer.MIN_VALUE;
        for (int i=1;i<n;i++){
            if(largest<nums[i]){
                third_largest=sec_largest;
                sec_largest=largest;
                largest=nums[i];
            }else if (sec_largest<nums[i] && nums[i]<largest ){
                third_largest=sec_largest;
               sec_largest=nums[i];
            }else if(third_largest<nums[i]){
                third_largest=nums[i];
            }
        }
        System.out.println(third_largest);
    }
}
