package Pattern_printing;

import java.util.Scanner;

//* * * * *
//*          *
//*          *
//*          *
//* * * * *

public class Rectangular {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1 ; i<=r; i++){
            for(int j=1 ; j<=c ;j++){
                if(i==1|| i==r||j==c||j==1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
