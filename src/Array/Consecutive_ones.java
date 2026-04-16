package Array;

import java.util.Scanner;
public class Consecutive_ones {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0 ; i<n;i++){
            if(arr[i]==1){
                count++;
            } else if (arr[i]==0) {
               max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        System.out.println(max);
    }
}
