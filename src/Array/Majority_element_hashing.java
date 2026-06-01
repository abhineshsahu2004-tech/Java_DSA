package Array;
import java.util.*;

public class Majority_element_hashing {
    static void main(String[] args) {
        int []arr={1,3,3,3,2};
        int n=arr.length;
        HashMap<Integer,Integer> H =new HashMap<>();
        for(int value: arr){
            H.put(value,H.getOrDefault(value,0)+1);
        }
        for(int value: H.keySet()){
            if(H.get(value)>n/2){
                System.out.println(value);
            }
        }
        System.out.println(" No majority element");
    }
}