package Conditional_statements;

import java.util.Scanner;

//Check whether a character is:
//   uppercase
//   lowercase
//   digit

public class Char_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        if (a >= 'A' &&  a <= 'Z'){
            System.out.println("Uppercase");
        }
        else if ( a  >='a' &&  a<='z' ) {
            System.out.println("Lowercase");
        }
        else if ( a>='1' && a<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
