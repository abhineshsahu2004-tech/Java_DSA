package Array;

public class Max_subarray_sum {
    static void main(String[] args) {
        int [] arr={1,-2,5,3,3,-4,5};
        int n=arr.length;
        int start=-1;
        int ansstart=-1;
        int ansend=-1;
        int sum=0;
        int max= Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (sum<0){
                sum=0;
                start=i+1;
            }
            if (sum>max){
                max=sum;
                ansstart=start;
                ansend=i;
            }
        }
        System.out.println(sum);
        for (int i=ansstart;i <=ansend;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
