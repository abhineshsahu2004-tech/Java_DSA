package Array;

public class Max_length_subarray_sum_k {
    static int Maxlengthsumsubarray(int [] arr){
        int n=arr.length;
        int i=0;
        int j=0;
        int length=0;
        int sum=0;
        int trgtsum=5;
        while(j<n){
            sum+=arr[j];
            while(sum>trgtsum){
                sum-=arr[i];
                i++;
            }
            if (sum==trgtsum){
                length=Math.max(length,j-i+1);
            }
            j++;
        }
        return length;
    }
    static void main(String[] args) {
        int [] Array={1,3,5,3,1,4,9,2,4};
        System.out.println(Maxlengthsumsubarray(Array));
    }
}
