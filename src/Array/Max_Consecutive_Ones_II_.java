package Array;

public class Max_Consecutive_Ones_II_ {
    static void main(String[] args) {
        int [] nums={1,0,1,1,0,1,1};
        int n= nums.length;
        int i=0, count=0,max=0;
        while(i<n){
            if(nums[i]==0){
              nums[i]=1;
              for(int j=0;j<n;j++){
                  if(nums[j]==1){
                      count++;
                  }else {
                      max = Math.max(max, count);
                      count = 0;
                  }
              }
              nums[i]=0;
            }
            i++;
        }
        System.out.println(max);
    }
}
