package Basics;

import java.util.ArrayList;
import java.util.*;

public class No_of_divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                L.add(i);
                if(n/i !=i)
                    L.add(n/i);
            }
        }
        System.out.println(L);
    }
}
