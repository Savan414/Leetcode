package Sorting;

//https://leetcode.com/problems/missing-number/
//Amazon question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                //swap the elements at index i and correctIndex

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        //search for first missing number
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }
}
