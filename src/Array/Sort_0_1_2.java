package Array;

public class Sort_0_1_2 {
    static void main(String[] args) {

    }
    static int[] sort012(int [] arr){
        int n=arr.length;
        int temp=0;
        int low=0;
        int mid=0;
        int high=n-1;
        for (int i=0;i<n;i++){
            if (mid[i]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            if (mid[i]==1){
                mid++;
            }
            if (mid[i]==2){}
        }
    }
}
