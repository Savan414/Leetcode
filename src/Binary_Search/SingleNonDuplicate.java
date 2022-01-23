package Binary_Search;

//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/s
public class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + ((right - left)>>1);

            if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 == 1 && nums[mid] == nums[mid-1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
