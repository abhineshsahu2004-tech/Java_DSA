package Basics;

import java.util.Scanner;

public class palindrome {
    static boolean ispalindrome(int n){
        int temp=n;
        int rev=0;
        int ld;
        while(temp>0){
            ld=temp%10;
            temp/=10;
            rev=(rev*10)+ld;
        }
        return rev==n ;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(ispalindrome(121));;
        System.out.println(ispalindrome(1251));;

    }
}
