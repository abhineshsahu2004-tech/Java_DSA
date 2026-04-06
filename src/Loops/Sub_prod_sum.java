package Loops;

import java.util.Scanner;

public class Sub_prod_sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        int temp;
        while (n != 0) {
            temp = n % 10;
            n /= 10;
            prod = temp * prod;
            sum = temp + sum;
        }
        System.out.println(prod - sum);
    }
}