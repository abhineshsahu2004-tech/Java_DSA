package Array;

import static Array.Print_array_.print;

public class Sort_Array_By_Parity {
    static void main(String[] args) {
        int [] arr={1,2,3,3,4,0,6,2};
        int n=arr.length;
        int i=0;
        int temp=0;
        for (int j=0;j<n;j++){
            if (arr[j]%2==0){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        print(arr);
    }
}
