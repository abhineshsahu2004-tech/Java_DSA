package Array;

public class Remove_duplicates_ {
 static int remove_duplicate(int[]arr){
    int n=arr.length,i=0,count=1;

   for (int j=1;j<n;j++){
       if (arr[i]!=arr[j]){
           arr[i+1]=arr[j];
           i++;
           count++;
       }
   }
//printing the unique elements
   for (int k=0;k<count;k++){
       System.out.print(arr[k]+" ");
   }
     System.out.println();
     return count ;
}
public static void main(String[] args) {
        int[] Happy = {0, 1, 2,2 , 6};
    System.out.println(remove_duplicate(Happy));
    }
}