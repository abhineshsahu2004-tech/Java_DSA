package Array;

public class Next_permutation {
    public static void main(String[] args) {
        int [] arr={2,1,5,4,3,0};
        Nextpermutation(arr);
    }
         static int[] Reverse(int[] arr,int start,int end){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            return arr;
        }
        public static void Nextpermutation(int[] arr) {
            int n=arr.length;
            int start=0;
            int end=n-1;
            int idx=-1;
            for(int i=n-2;i>=0;i--){
                if(arr[i]<arr[i+1]){
                    idx=i;
                    break;
                }
            }
            if(idx==-1){
                Reverse(arr,start,end);
                print.print(arr);
               return ;
            }
            for(int i=end;i>idx;i--){
                if(arr[idx]<arr[i]){
                    int temp=arr[idx];
                    arr[idx]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
            Reverse(arr,idx+1,end);
           print.print(arr);
        }
    }
