package Array;

import java.util.Scanner;

public class Sec_smallest {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,0,9,5,6};
        int n=arr.length;
        int smallest=Integer.MAX_VALUE;
        int sec_smallest=Integer.MAX_VALUE;
        for (int i=0 ; i<n ; i++){
            if (smallest>arr[i]){
                sec_smallest=smallest;
                smallest=arr[i];
            } else if (smallest<arr[i] && sec_smallest>arr[i]) {
                sec_smallest=arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(sec_smallest);
    }
}
