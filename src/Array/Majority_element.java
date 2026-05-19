package Array;

public class Majority_element {
    static void main(String[] args) {
        int []arr={1,3,3,3,2};
        int n=arr.length;
        int freq=1;
        int ans=arr[0];
        for (int i=0;i<n;i++){
            if(freq==0){
                ans=arr[i];
            }
            if (ans==arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        System.out.println(ans);
    }
}
