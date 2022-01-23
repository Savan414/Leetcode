package Sorting;

public class FindErrorNums {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums){

        int index = 0;
        while(index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] != index + 1 && nums[index] != nums[correctIndex] ){
                swap(nums, index, correctIndex);
            }
            else{
                index++;
            }
        }

        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                result[0] = nums[i];
                result[1] = i + 1;
            }
        }

        return result;
    }

    private static void swap(int[] nums, int currentIndex, int swapIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
    }
}
