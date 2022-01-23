package Binary_Search;

//https:leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RotatedSearch {

    public int search(int[] nums, int target) {
        
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[0]) {
                if (nums[mid] < target && target < nums[0]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (nums[mid] > target && target >= nums[0]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }
}
