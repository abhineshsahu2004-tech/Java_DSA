package Array;
import java.util.Arrays;

public class Sort_0_1_2 {
    static int[] sort012(int [] arr) {
        int n = arr.length;
        int temp = 0;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 2) {
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            } else{
                mid++;
            }
        }
        return arr;
    }
    static void main(String[] args) {
        int [] arr={1,0,2,0,2,2};
        System.out.println(Arrays.toString(sort012(arr)));
    }
}
