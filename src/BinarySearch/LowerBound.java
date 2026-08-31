package BinarySearch;

public class LowerBound {
    static int LB(int[] arr,int target){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                i=mid+1;
            }
            else {
                ans=mid;
                j=mid-1;
            }
        }
        return ans;
    } 
    static void main(String[] args) {
        int[] arr={1,2,3,5,6,6,7,8,8};
        System.out.println(LB(arr,6));
    }
}
