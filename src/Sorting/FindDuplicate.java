package Sorting;

//Amazon question
public class FindDuplicate {
    public static void main(String[] args) {

    }

    public static int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != i + 1 ){
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }

        return -1;
    }

    private static void swap(int[] nums, int currentIndex, int swapIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
    }
}
