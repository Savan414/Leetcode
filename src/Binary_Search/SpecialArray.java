package Binary_Search;

import java.util.Arrays;

public class SpecialArray {

    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
    }

    public static int specialArray(int[] nums) {

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int numsLeft = nums.length - mid;  //Number of elements left after mid index
            if(nums[mid] >= numsLeft){
                //treat index 0 to avoid indexOutOfBoundError
                if(mid == 0 || nums[mid - 1] < numsLeft){
                    return numsLeft;
                }
                else {
                    //not the first position move the right bound
                    end = mid - 1;
                }
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
