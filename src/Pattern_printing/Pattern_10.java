package Pattern_printing;

import java.util.Scanner;

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

public class Pattern_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int ans=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ;j<=i ; j++){
                System.out.print(ans +" ");
                ans++;
            }
            System.out.println();
        }
    }
}
