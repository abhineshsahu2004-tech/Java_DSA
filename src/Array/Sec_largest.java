package Array;

public class Sec_largest {
    static void main(String[] args) {
        int[] arr = {1, 9, 0,1,34};
        int n= arr.length;
        int seclargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for( int i=0 ; i<n ; i++) {
            if (largest<arr[i]) {
                seclargest=largest;
                largest = arr[i];
            }
            else if(largest>arr[i]){
                if(seclargest<arr[i]){
                    seclargest=arr[i];
                }
            }
        }
        System.out.println(seclargest);
    }
}
