package Array;
import java.util.*;

public class Pascals_Triangle {
    static ArrayList<ArrayList<Integer>> PascalsTriangle(int n){
        ArrayList<ArrayList<Integer>> Result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> A=new ArrayList<>();
            int ans=1;
            A.add(ans);
            for (int j=1;j<i;j++){
                ans*=i-j;
                ans/=j;
                A.add(ans);
            }
            Result.add(A);
        }
        return Result;
    }
    static void main(String[] args) {
        System.out.println(PascalsTriangle(6));
    }
}
