package Array;

import java.util.Scanner;

import static Array.Print_array.print;

public class Remove_element {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target element");
        int m =sc.nextInt();
        int[] arr ={3,1,2,3,5,2,3,1};
        int n=arr.length;
        int i=0;
        while (i<n){
            if(arr[i]==m){
                arr[i]=arr[n-1];
                n--;
            }
            else {
                i++;
            }
        }
        System.out.println(n);
        for ( i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
