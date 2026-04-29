package Array;

import java.util.ArrayList;

public class Intersection_of_arrays {
    static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={2,3,5,8};
        ArrayList<Integer> ans=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j] ){
                i++;
            } else if(nums1[i]>nums2[j] ){
                j++;
            } else if( nums1[i]==nums2[j] ){
                if(ans.isEmpty() || ans.getLast()!=nums1[i])
                    ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}