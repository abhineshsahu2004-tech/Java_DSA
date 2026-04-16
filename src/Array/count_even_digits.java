package Array;

import java.util.*;

public class count_even_digits {
    static int CountEvenDigit(int [] arr){
        int ans=0;
        for (int num : arr){
             int count =String.valueOf(num).length();
            if (count%2==0){
                ans++;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] Arr={145,45,9565,55,665};
        System.out.println(CountEvenDigit(Arr));
    }
}
