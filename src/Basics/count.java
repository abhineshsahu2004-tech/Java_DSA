package Basics;

import java.util.Scanner;

import static java.lang.Math.log10;

public class count {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=(int)(log10(n)+1) ;
        System.out.println(count);

    }
}
