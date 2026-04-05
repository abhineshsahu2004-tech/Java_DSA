package Conditional_statements;

import java.util.Scanner;

//Check whether a triangle is:
//   Equilateral
//   Isosceles
//   Scalene

public class Check_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A+B>C && A+C>B && B+C>A){
            if(A==B && B==C){
                System.out.println("The triangle is a Equilateral triangle");
            }
            else if(A==B|| B==C ){
                System.out.println("The triangle is a Isosceles triangle");
            }
            else{
                System.out.println("The triangle is a Scalene triangle");
            }
        }
        else{
            System.out.println("It is not a  triangle");
        }
    }
}
