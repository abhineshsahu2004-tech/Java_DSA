package Array;

public class Pprint {
    static int [][] pprint(int [][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}