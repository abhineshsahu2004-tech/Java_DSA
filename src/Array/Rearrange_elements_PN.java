package Array;
import java.util.*;

public class Rearrange_elements_PN {
    static void main() {
        int [] arr={1,-3,4,7,-6,4};
        int n =arr.length;
        ArrayList<Integer> pos =new ArrayList<> ();
        ArrayList<Integer> neg =new ArrayList<>();
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        for (int i=0;i<neg.size();i++){
            arr[i*2]=pos.get(i);
            arr[i*2+1]=neg.get(i);
        }
        int index=2*neg.size();
        for (int i=neg.size();i<pos.size();i++) {
            arr[index]=pos.get(i);
            index++;
        }
        for (int value : arr){
            System.out.print(" "+value);
        }
    }
}
