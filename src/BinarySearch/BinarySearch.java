package BinarySearch;

public  class BinarySearch {
    static int BS(int [] arr, int target){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j) {
            int mid = (i + j) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,8};
        System.out.println(BS(arr,7));
    }
}
