package Pattern_printing;

import java.util.Scanner;

//1234567
//2345671
//3456712
//4567123
//5671234
//6712345
//7123456

public class Numerical_rectangular {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for(int i=1 ;i<=n ;i++){
            for(int j=i ;j<=n ;j++){
                System.out.print(j);
            }
            for(int k= 1;k<=i-1 ;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
