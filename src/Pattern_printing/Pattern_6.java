package Pattern_printing;

import java.util.Scanner;

//1
//12
//123
//1234
//12345
//1234
//123
//12
//1
public class Pattern_6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n; i++){
            for( int j= 1 ; j<= i ; j++){
                System.out.print(j);
            }System.out.println();
        }
        for( int i=1 ;i<= n-1 ; i++){
            for( int  j = 1; j<= n-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
