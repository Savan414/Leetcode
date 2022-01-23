package Binary_Search;

import java.util.Arrays;

public class CheckIfExist {

    public static void main(String[] args) {

    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int numOfZeroes = 0;
        for(int i = 0; i < arr.length; i++ ){

            //Find if there are any zeroes initially else run binary search
            if(arr[i] != 0){
                int start = 0;
                int end = arr.length - 1;

                while(start <= end){
                    int mid = start + (end - start)/2;

                    if(arr[mid] == 2*arr[i]){
                        return true;
                    }
                    else if(arr[mid] < 2*arr[i]){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
            }
            else{
                ++numOfZeroes;
            }
        }

        return numOfZeroes >= 2;
    }
}
