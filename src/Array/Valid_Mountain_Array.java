package Array;

 class Valid_Mountain_Array {
    static boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
    static void main(String[] args) {
        int [] arr={0,2,3,4,5,2,1,0};
        System.out.println(validMountainArray(arr));
    }
}
