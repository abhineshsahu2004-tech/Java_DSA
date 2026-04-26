package Array;

import static Array.Print_array_.print;

public class Move_Zeroes_ {
    static void main(String[] args) {
        int[] arr = {0,7,0, 1, 2,2 , 6};
        int n=arr.length;
        int i=0,temp;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        print(arr);
    }
}