package Basics;

import java.util.Scanner;

public class Optimized_Power {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no. :");
        int n=sc.nextInt();
        System.out.println("Enter power : ");
        int p =sc.nextInt();
        int ans=1;
        while(p>0){
            if(p%2==0){
                p/=2;
                n*=n;
            }
            else{
                p-=1;
                ans*=n;
            }
        }
        System.out.println(ans);
    }
}
