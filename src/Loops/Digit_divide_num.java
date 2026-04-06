package Loops;

import java.util.Scanner;

public class Digit_divide_num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int count = 0;
        while (temp != 0) {
            rem = temp % 10;
            temp /= 10;
            if (rem != 0 && num % rem == 0)
                count++;
        }
        System.out.println(count);
    }
}
