package Array;

public class Rearrange_elements {
    static void main() {
        int [] arr={1,-3,4,-7,-6,4};
        int n =arr.length;
        int[] ans=new int [n] ;
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        print.print(ans);
    }
}
