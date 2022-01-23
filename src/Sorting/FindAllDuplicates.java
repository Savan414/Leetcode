package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums){

        List<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != i + 1 && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    private static void swap(int[] nums, int currentIndex, int swapIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
    }
}
