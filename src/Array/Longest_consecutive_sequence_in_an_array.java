package Array;


import java.util.*;

public class Longest_consecutive_sequence_in_an_array {
    static void main(String[] args) {
        int[] arr={100,4,3,101,5,1,2};
        System.out.println(Longest_consecutive_sequence(arr));
    }
    static int Longest_consecutive_sequence(int[] arr){
        int n = arr.length;
        int count = 1;
        int max = 1;
        Arrays.sort(arr);
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] + 1) == arr[i + 1]) {
                count++;
                max = Math.max(max, count);
            } else if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                count = 1;
            }
        }
        return max;
    }
}
