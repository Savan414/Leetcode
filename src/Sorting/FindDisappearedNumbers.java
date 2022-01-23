package Sorting;

import java.util.ArrayList;
import java.util.List;

//Google question
// https://leetcode.com/problems/fins-all-numbers-disappeared-in-an-array/
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr){

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

        //find missing numbers
        List<Integer> result = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                result.add(index+1);
            }
        }

        return result;
    }

}
