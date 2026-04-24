package Array;

import java.util.*;
import static Array.Print_array.print;

public class Duplicate_zeroes {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,0,2,3,0,4,5,0};
        int n=arr.length;

        // BRUTE FORCE APPROACH

        int [] result=new int [n];
        int i=0;
        int j=0;
        while(j<n){
            if (arr[i]==0){
                result[j]=0;
                j++;
                result[j]=0;
            }
            else {
                result[j]=arr[i];
            }
            i++;
            j++;
        }
         print(result);

        //OPTIMISED APPROACH

        int ldx=n-1;
        int possiblezerodups=0;
        for ( i=0 ; i<=n-possiblezerodups;i++){
            if(arr[i]==0){
                //edge case
                if (i==ldx-possiblezerodups){
                    arr[ldx]=0;
                    ldx-=1;
                    break;
                }
                possiblezerodups++;
            }
        }
        int newldx=ldx-possiblezerodups;
        for ( i=newldx;i>=0;i--){
            if (arr[i]==0){
                arr[i+possiblezerodups]=0;
                possiblezerodups--;
                arr[i+possiblezerodups]=0;
            } else {
                arr[i+possiblezerodups]=arr[i];
            }
        }
        System.out.println();
        print(arr);
    }
}
