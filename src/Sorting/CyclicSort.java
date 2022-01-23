package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1; //The index where the current element should actually be

            if(arr[i] != arr[correctIndex]){
                //swap the elements at index i and correctIndex
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}
