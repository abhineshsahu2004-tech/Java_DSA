package Basics;

import java.util.*;

public class Print_prime_factors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. :");
        int n = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if(n%i==0){
                L.add(i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        System.out.println(L);
    }
}
