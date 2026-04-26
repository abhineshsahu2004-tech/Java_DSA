package Array;
import java.util.Scanner;

public class Check_sorted_ {
    static boolean sort(int [] arr) {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]){}
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []Happy={0,1,2,5,6};
        System.out.println(sort(Happy));
    }
}
