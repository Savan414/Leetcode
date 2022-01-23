package Binary_Search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] arr = {3,5,7,2,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {

        if(arr.length < 3){
            throw new IllegalArgumentException("Length of Array is less than 3!");
        }

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
