package Basics;
import java.util.*;
import static java.lang.Math.log10;

public class Armstrong {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int temp=n;
        int ans=0;
        int count =(int)log10(temp)+1;
        while(temp>0){
            int ld=temp%10;
            temp/=10;
            ans+= (int) Math.pow(ld,count);
        }
        if(n==ans){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
