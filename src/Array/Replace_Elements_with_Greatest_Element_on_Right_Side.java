package Array;

import static Array.Print_array.print;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    static void main(String[] args) {
        int[] arr = {16, 18, 5, 4, 6, 1};
        int temp=0;
        int max=-1;
        for(int i=arr.length-1;i>=0;i--) {
            temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        print(arr);
    }
}
