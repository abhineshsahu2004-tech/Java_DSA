package Array;

import java.util.HashSet;

public class Check_If_N_and_Its_Double_Exist {
    static boolean checkIfExist(int[] arr) {
        HashSet<Integer> has=new HashSet<>();
        for(int val:arr){
            if(has.contains(2*val) || (has.contains(val/2) && val%2==0)){
                return true;
            }
            has.add(val);
        }
        return false;
    }

    static void main(String[] args) {
        int[] arr={11,2,5,7};
        System.out.println(checkIfExist(arr));
    }
}
