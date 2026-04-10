package Basics;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2 : ");
        int n2 = sc.nextInt();
        int GCD=0;
        for(int i=1 ;i<=Math.min(n1,n2) ;i++){
            if(n1%i==0 && n2%i==0){
                GCD=i;
            }
        }
        System.out.println(GCD);
    }
}
