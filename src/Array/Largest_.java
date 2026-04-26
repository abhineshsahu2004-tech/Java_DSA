package Array;

import java.util.Scanner;

public class Largest_ {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,0,9,5,6};
        int largest =Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length ;i++){
            if(largest <arr[i]){
                largest =arr[i];
            }
        }
        System.out.println(largest);
    }
}
