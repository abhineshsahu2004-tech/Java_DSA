package Array;

import java.util.ArrayList;

public class Union_of_two_array {
    static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={2,3,5,8};
        ArrayList<Integer> ans=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(ans.isEmpty() || ans.getLast()!=nums1[i]){
                ans.add(nums1[i] );
                }
                i++;
            } else if(nums1[i]>nums2[j] ) {
                if (ans.isEmpty() || ans.getLast() != nums2[j]){
                    ans.add(nums2[j]);
            }
                j++;
            } else {
                if (ans.isEmpty() || ans.getLast()!=nums1[i]) {
                    ans.add(nums1[i]);
                }
                    i++;
                    j++;
            }
        }
        while(i<n1){
            if (ans.isEmpty() || ans.getLast()!=nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }
        while(j<n2){
            if (ans.isEmpty() || ans.getLast()!=nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }
        System.out.println(ans);
    }
}
